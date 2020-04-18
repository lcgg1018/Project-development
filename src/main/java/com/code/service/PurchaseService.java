package com.code.service;

import com.code.entity.Purchase;
import java.util.List;

/**
 * (Purchase)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:55
 */
public interface PurchaseService {

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    Purchase queryById(Integer purchaseId);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Purchase>selectAll();

    /**
     * 新增数据
     *
     * @param purchase 实例对象
     * @return 实例对象
     */
    Purchase insert(Purchase purchase);

    /**
     * 修改数据
     *
     * @param purchase 实例对象
     * @return 实例对象
     */
    Purchase update(Purchase purchase);

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer purchaseId);

}