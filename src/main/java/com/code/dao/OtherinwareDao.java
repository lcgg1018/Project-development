package com.code.dao;

import com.code.entity.Otherinware;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Otherinware)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public interface OtherinwareDao {

    /**
     * 通过ID查询单条数据
     *
     * @param otherinwareid 主键
     * @return 实例对象
     */
    Otherinware queryById(Integer otherinwareid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Otherinware> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param otherinware 实例对象
     * @return 对象列表
     */
    List<Otherinware> queryAll(Otherinware otherinware);

    /**
     * 新增数据
     *
     * @param otherinware 实例对象
     * @return 影响行数
     */
    int insert(Otherinware otherinware);

    /**
     * 修改数据
     *
     * @param otherinware 实例对象
     * @return 影响行数
     */
    int update(Otherinware otherinware);

    /**
     * 通过主键删除数据
     *
     * @param otherinwareid 主键
     * @return 影响行数
     */
    int deleteById(Integer otherinwareid);

}