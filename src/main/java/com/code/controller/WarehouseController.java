package com.code.controller;

import com.code.entity.Warehouse;
import com.code.service.WarehouseService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Warehouse)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@RestController
@RequestMapping("warehouse")
public class WarehouseController {
    /**
     * 服务对象
     */
    @Resource
    private WarehouseService warehouseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Warehouse selectOne(Integer id) {
        return this.warehouseService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Warehouse> selectAll(){
           return this.warehouseService.selectAll();
    }

}