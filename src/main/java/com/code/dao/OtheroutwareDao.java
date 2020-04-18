package com.code.dao;

import com.code.entity.Otheroutware;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Otheroutware)表数据库访问层
 *
 * @author yap
 * @since 2020-04-18 16:52:55
 */
public interface OtheroutwareDao {

    /**
     * 通过ID查询单条数据
     *
     * @param otheroutwareid 主键
     * @return 实例对象
     */
    Otheroutware queryById(Integer otheroutwareid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Otheroutware> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param otheroutware 实例对象
     * @return 对象列表
     */
    List<Otheroutware> queryAll(Otheroutware otheroutware);

    /**
     * 新增数据
     *
     * @param otheroutware 实例对象
     * @return 影响行数
     */
    int insert(Otheroutware otheroutware);

    /**
     * 修改数据
     *
     * @param otheroutware 实例对象
     * @return 影响行数
     */
    int update(Otheroutware otheroutware);

    /**
     * 通过主键删除数据
     *
     * @param otheroutwareid 主键
     * @return 影响行数
     */
    int deleteById(Integer otheroutwareid);

}