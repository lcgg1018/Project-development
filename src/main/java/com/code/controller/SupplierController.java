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
 * @since 2020-04-19 02:16:40
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
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Supplier> selectAll(){
           return this.supplierService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param supplier 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Supplier>  queryAll(Supplier supplier){
           return this.supplierService.queryAll(supplier);
    }

}