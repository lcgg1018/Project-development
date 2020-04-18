package com.code.dao;

import com.code.entity.RoleAction;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (RoleAction)表数据库访问层
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public interface RoleActionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RoleAction queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RoleAction> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param roleAction 实例对象
     * @return 对象列表
     */
    List<RoleAction> queryAll(RoleAction roleAction);

    /**
     * 新增数据
     *
     * @param roleAction 实例对象
     * @return 影响行数
     */
    int insert(RoleAction roleAction);

    /**
     * 修改数据
     *
     * @param roleAction 实例对象
     * @return 影响行数
     */
    int update(RoleAction roleAction);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}