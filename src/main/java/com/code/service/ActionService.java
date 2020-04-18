package com.code.service;

import com.code.entity.Action;
import java.util.List;

/**
 * (Action)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
public interface ActionService {

    /**
     * 通过ID查询单条数据
     *
     * @param actionId 主键
     * @return 实例对象
     */
    Action queryById(Integer actionId);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Action>selectAll();

    /**
     * 新增数据
     *
     * @param action 实例对象
     * @return 实例对象
     */
    Action insert(Action action);

    /**
     * 修改数据
     *
     * @param action 实例对象
     * @return 实例对象
     */
    Action update(Action action);

    /**
     * 通过主键删除数据
     *
     * @param actionId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer actionId);

}