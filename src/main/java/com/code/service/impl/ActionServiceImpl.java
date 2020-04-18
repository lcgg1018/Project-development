package com.code.service.impl;

import com.code.entity.Action;
import com.code.dao.ActionDao;
import com.code.service.ActionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Action)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@Service("actionService")
public class ActionServiceImpl implements ActionService {
    @Resource
    private ActionDao actionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param actionId 主键
     * @return 实例对象
     */
    @Override
    public Action queryById(Integer actionId) {
        return this.actionDao.queryById(actionId);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Action> selectAll(){
        return this.actionDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param action 实例对象
     * @return 实例对象
     */
    @Override
    public Action insert(Action action) {
        this.actionDao.insert(action);
        return action;
    }

    /**
     * 修改数据
     *
     * @param action 实例对象
     * @return 实例对象
     */
    @Override
    public Action update(Action action) {
        this.actionDao.update(action);
        return this.queryById(action.getActionId());
    }

    /**
     * 通过主键删除数据
     *
     * @param actionId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer actionId) {
        return this.actionDao.deleteById(actionId) > 0;
    }
}