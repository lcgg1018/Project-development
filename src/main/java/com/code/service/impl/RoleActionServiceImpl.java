package com.code.service.impl;

import com.code.entity.RoleAction;
import com.code.dao.RoleActionDao;
import com.code.service.RoleActionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RoleAction)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@Service("roleActionService")
public class RoleActionServiceImpl implements RoleActionService {
    @Resource
    private RoleActionDao roleActionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RoleAction queryById(Integer id) {
        return this.roleActionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<RoleAction> selectAll(){
        return this.roleActionDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param roleAction 实例对象
     * @return 实例对象
     */
    @Override
    public RoleAction insert(RoleAction roleAction) {
        this.roleActionDao.insert(roleAction);
        return roleAction;
    }

    /**
     * 修改数据
     *
     * @param roleAction 实例对象
     * @return 实例对象
     */
    @Override
    public RoleAction update(RoleAction roleAction) {
        this.roleActionDao.update(roleAction);
        return this.queryById(roleAction.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.roleActionDao.deleteById(id) > 0;
    }
}