package com.code.dao;

import com.code.entity.PurchaseReturn;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (PurchaseReturn)表数据库访问层
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public interface PurchaseReturnDao {

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    PurchaseReturn queryById(Integer purchaseId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PurchaseReturn> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param purchaseReturn 实例对象
     * @return 对象列表
     */
    List<PurchaseReturn> queryAll(PurchaseReturn purchaseReturn);

    /**
     * 新增数据
     *
     * @param purchaseReturn 实例对象
     * @return 影响行数
     */
    int insert(PurchaseReturn purchaseReturn);

    /**
     * 修改数据
     *
     * @param purchaseReturn 实例对象
     * @return 影响行数
     */
    int update(PurchaseReturn purchaseReturn);

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 影响行数
     */
    int deleteById(Integer purchaseId);

}