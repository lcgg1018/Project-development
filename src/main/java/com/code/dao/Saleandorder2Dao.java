package com.code.dao;

import com.code.entity.Saleandorder2;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Saleandorder2)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface Saleandorder2Dao {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Saleandorder2 queryById(Integer sid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Saleandorder2> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param saleandorder2 实例对象
     * @return 对象列表
     */
    List<Saleandorder2> queryAll(Saleandorder2 saleandorder2);

    /**
     * 新增数据
     *
     * @param saleandorder2 实例对象
     * @return 影响行数
     */
    int insert(Saleandorder2 saleandorder2);

    /**
     * 修改数据
     *
     * @param saleandorder2 实例对象
     * @return 影响行数
     */
    int update(Saleandorder2 saleandorder2);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 影响行数
     */
    int deleteById(Integer sid);

}