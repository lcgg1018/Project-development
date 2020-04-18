package com.code.dao;

import com.code.entity.Inventory;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Inventory)表数据库访问层
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
public interface InventoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param inventoryid 主键
     * @return 实例对象
     */
    Inventory queryById(Integer inventoryid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Inventory> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param inventory 实例对象
     * @return 对象列表
     */
    List<Inventory> queryAll(Inventory inventory);

    /**
     * 新增数据
     *
     * @param inventory 实例对象
     * @return 影响行数
     */
    int insert(Inventory inventory);

    /**
     * 修改数据
     *
     * @param inventory 实例对象
     * @return 影响行数
     */
    int update(Inventory inventory);

    /**
     * 通过主键删除数据
     *
     * @param inventoryid 主键
     * @return 影响行数
     */
    int deleteById(Integer inventoryid);

}