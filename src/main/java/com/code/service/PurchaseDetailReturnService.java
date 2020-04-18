package com.code.service;

import com.code.entity.PurchaseDetailReturn;
import java.util.List;

/**
 * (PurchaseDetailReturn)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface PurchaseDetailReturnService {

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    PurchaseDetailReturn queryById(Integer purchaseId);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<PurchaseDetailReturn>selectAll();

    /**
     * 新增数据
     *
     * @param purchaseDetailReturn 实例对象
     * @return 实例对象
     */
    PurchaseDetailReturn insert(PurchaseDetailReturn purchaseDetailReturn);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param purchaseDetailReturn 实例对象
     * @return 对象列表
     */
    List<PurchaseDetailReturn> queryAll(PurchaseDetailReturn purchaseDetailReturn);

    /**
     * 修改数据
     *
     * @param purchaseDetailReturn 实例对象
     * @return 实例对象
     */
    PurchaseDetailReturn update(PurchaseDetailReturn purchaseDetailReturn);

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer purchaseId);

}