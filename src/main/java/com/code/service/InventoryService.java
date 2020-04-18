package com.code.service;

import com.code.entity.Inventory;
import java.util.List;

/**
 * (Inventory)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
public interface InventoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param inventoryid 主键
     * @return 实例对象
     */
    Inventory queryById(Integer inventoryid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Inventory>selectAll();

    /**
     * 新增数据
     *
     * @param inventory 实例对象
     * @return 实例对象
     */
    Inventory insert(Inventory inventory);

    /**
     * 修改数据
     *
     * @param inventory 实例对象
     * @return 实例对象
     */
    Inventory update(Inventory inventory);

    /**
     * 通过主键删除数据
     *
     * @param inventoryid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer inventoryid);

}