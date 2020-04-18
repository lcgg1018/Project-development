package com.code.service.impl;

import com.code.entity.Kehu;
import com.code.dao.KehuDao;
import com.code.service.KehuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Kehu)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@Service("kehuService")
public class KehuServiceImpl implements KehuService {
    @Resource
    private KehuDao kehuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Kehu queryById(String id) {
        return this.kehuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Kehu> selectAll(){
        return this.kehuDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param kehu 实例对象
     * @return 实例对象
     */
    @Override
    public Kehu insert(Kehu kehu) {
        this.kehuDao.insert(kehu);
        return kehu;
    }

    /**
     * 修改数据
     *
     * @param kehu 实例对象
     * @return 实例对象
     */
    @Override
    public Kehu update(Kehu kehu) {
        this.kehuDao.update(kehu);
        return this.queryById(kehu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.kehuDao.deleteById(id) > 0;
    }
}