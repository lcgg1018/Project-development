package com.code.service;

import com.code.entity.Suppliertype;
import java.util.List;

/**
 * (Suppliertype)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public interface SuppliertypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param stypeid 主键
     * @return 实例对象
     */
    Suppliertype queryById(Integer stypeid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Suppliertype>selectAll();

    /**
     * 新增数据
     *
     * @param suppliertype 实例对象
     * @return 实例对象
     */
    Suppliertype insert(Suppliertype suppliertype);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param suppliertype 实例对象
     * @return 对象列表
     */
    List<Suppliertype> queryAll(Suppliertype suppliertype);

    /**
     * 修改数据
     *
     * @param suppliertype 实例对象
     * @return 实例对象
     */
    Suppliertype update(Suppliertype suppliertype);

    /**
     * 通过主键删除数据
     *
     * @param stypeid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer stypeid);

}