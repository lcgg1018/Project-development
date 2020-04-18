package com.code.dao;

import com.code.entity.Purchase;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Purchase)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public interface PurchaseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    Purchase queryById(Integer purchaseId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Purchase> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param purchase 实例对象
     * @return 对象列表
     */
    List<Purchase> queryAll(Purchase purchase);

    /**
     * 新增数据
     *
     * @param purchase 实例对象
     * @return 影响行数
     */
    int insert(Purchase purchase);

    /**
     * 修改数据
     *
     * @param purchase 实例对象
     * @return 影响行数
     */
    int update(Purchase purchase);

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 影响行数
     */
    int deleteById(Integer purchaseId);

}