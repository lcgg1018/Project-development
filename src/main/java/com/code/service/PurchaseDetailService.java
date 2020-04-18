package com.code.service;

import com.code.entity.PurchaseDetail;
import java.util.List;

/**
 * (PurchaseDetail)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:55
 */
public interface PurchaseDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    PurchaseDetail queryById(Integer purchaseId);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<PurchaseDetail>selectAll();

    /**
     * 新增数据
     *
     * @param purchaseDetail 实例对象
     * @return 实例对象
     */
    PurchaseDetail insert(PurchaseDetail purchaseDetail);

    /**
     * 修改数据
     *
     * @param purchaseDetail 实例对象
     * @return 实例对象
     */
    PurchaseDetail update(PurchaseDetail purchaseDetail);

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer purchaseId);

}