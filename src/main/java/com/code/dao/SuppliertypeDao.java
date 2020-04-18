package com.code.dao;

import com.code.entity.Suppliertype;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Suppliertype)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public interface SuppliertypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param stypeid 主键
     * @return 实例对象
     */
    Suppliertype queryById(Integer stypeid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Suppliertype> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param suppliertype 实例对象
     * @return 对象列表
     */
    List<Suppliertype> queryAll(Suppliertype suppliertype);

    /**
     * 新增数据
     *
     * @param suppliertype 实例对象
     * @return 影响行数
     */
    int insert(Suppliertype suppliertype);

    /**
     * 修改数据
     *
     * @param suppliertype 实例对象
     * @return 影响行数
     */
    int update(Suppliertype suppliertype);

    /**
     * 通过主键删除数据
     *
     * @param stypeid 主键
     * @return 影响行数
     */
    int deleteById(Integer stypeid);

}