package com.code.service;

import com.code.entity.PurchaseReturn;
import java.util.List;

/**
 * (PurchaseReturn)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface PurchaseReturnService {

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    PurchaseReturn queryById(Integer purchaseId);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<PurchaseReturn>selectAll();

    /**
     * 新增数据
     *
     * @param purchaseReturn 实例对象
     * @return 实例对象
     */
    PurchaseReturn insert(PurchaseReturn purchaseReturn);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param purchaseReturn 实例对象
     * @return 对象列表
     */
    List<PurchaseReturn> queryAll(PurchaseReturn purchaseReturn);

    /**
     * 修改数据
     *
     * @param purchaseReturn 实例对象
     * @return 实例对象
     */
    PurchaseReturn update(PurchaseReturn purchaseReturn);

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer purchaseId);

}