package com.code.controller;

import com.code.entity.Inventory;
import com.code.service.InventoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Inventory)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@RestController
@RequestMapping("inventory")
public class InventoryController {
    /**
     * 服务对象
     */
    @Resource
    private InventoryService inventoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Inventory selectOne(Integer id) {
        return this.inventoryService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Inventory> selectAll(){
           return this.inventoryService.selectAll();
    }

}