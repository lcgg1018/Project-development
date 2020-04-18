package com.code.dao;

import com.code.entity.PurchaseDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (PurchaseDetail)表数据库访问层
 *
 * @author yap
 * @since 2020-04-18 16:52:55
 */
public interface PurchaseDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    PurchaseDetail queryById(Integer purchaseId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PurchaseDetail> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param purchaseDetail 实例对象
     * @return 对象列表
     */
    List<PurchaseDetail> queryAll(PurchaseDetail purchaseDetail);

    /**
     * 新增数据
     *
     * @param purchaseDetail 实例对象
     * @return 影响行数
     */
    int insert(PurchaseDetail purchaseDetail);

    /**
     * 修改数据
     *
     * @param purchaseDetail 实例对象
     * @return 影响行数
     */
    int update(PurchaseDetail purchaseDetail);

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 影响行数
     */
    int deleteById(Integer purchaseId);

}