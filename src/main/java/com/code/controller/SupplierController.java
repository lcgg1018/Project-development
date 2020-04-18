package com.code.controller;

import com.code.entity.Supplier;
import com.code.service.SupplierService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Supplier)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@RestController
@RequestMapping("supplier")
public class SupplierController {
    /**
     * 服务对象
     */
    @Resource
    private SupplierService supplierService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Supplier selectOne(Integer id) {
        return this.supplierService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Supplier> selectAll(){
           return this.supplierService.selectAll();
    }

}