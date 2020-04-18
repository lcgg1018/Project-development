package com.code.dao;

import com.code.entity.PurchaseDetailReturn;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (PurchaseDetailReturn)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface PurchaseDetailReturnDao {

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    PurchaseDetailReturn queryById(Integer purchaseId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PurchaseDetailReturn> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param purchaseDetailReturn 实例对象
     * @return 对象列表
     */
    List<PurchaseDetailReturn> queryAll(PurchaseDetailReturn purchaseDetailReturn);

    /**
     * 新增数据
     *
     * @param purchaseDetailReturn 实例对象
     * @return 影响行数
     */
    int insert(PurchaseDetailReturn purchaseDetailReturn);

    /**
     * 修改数据
     *
     * @param purchaseDetailReturn 实例对象
     * @return 影响行数
     */
    int update(PurchaseDetailReturn purchaseDetailReturn);

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 影响行数
     */
    int deleteById(Integer purchaseId);

}