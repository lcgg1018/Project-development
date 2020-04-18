package com.code.service.impl;

import com.code.entity.Inventory;
import com.code.dao.InventoryDao;
import com.code.service.InventoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Inventory)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@Service("inventoryService")
public class InventoryServiceImpl implements InventoryService {
    @Resource
    private InventoryDao inventoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param inventoryid 主键
     * @return 实例对象
     */
    @Override
    public Inventory queryById(Integer inventoryid) {
        return this.inventoryDao.queryById(inventoryid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Inventory> selectAll(){
        return this.inventoryDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param inventory 实例对象
     * @return 实例对象
     */
    @Override
    public Inventory insert(Inventory inventory) {
        this.inventoryDao.insert(inventory);
        return inventory;
    }

    /**
     * 修改数据
     *
     * @param inventory 实例对象
     * @return 实例对象
     */
    @Override
    public Inventory update(Inventory inventory) {
        this.inventoryDao.update(inventory);
        return this.queryById(inventory.getInventoryid());
    }

    /**
     * 通过主键删除数据
     *
     * @param inventoryid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer inventoryid) {
        return this.inventoryDao.deleteById(inventoryid) > 0;
    }
}