package com.code.dao;

import com.code.entity.Action;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Action)表数据库访问层
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
public interface ActionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param actionId 主键
     * @return 实例对象
     */
    Action queryById(Integer actionId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Action> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param action 实例对象
     * @return 对象列表
     */
    List<Action> queryAll(Action action);

    /**
     * 新增数据
     *
     * @param action 实例对象
     * @return 影响行数
     */
    int insert(Action action);

    /**
     * 修改数据
     *
     * @param action 实例对象
     * @return 影响行数
     */
    int update(Action action);

    /**
     * 通过主键删除数据
     *
     * @param actionId 主键
     * @return 影响行数
     */
    int deleteById(Integer actionId);

}