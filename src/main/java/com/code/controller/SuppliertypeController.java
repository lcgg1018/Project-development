package com.code.controller;

import com.code.entity.Suppliertype;
import com.code.service.SuppliertypeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Suppliertype)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
@RestController
@RequestMapping("suppliertype")
public class SuppliertypeController {
    /**
     * 服务对象
     */
    @Resource
    private SuppliertypeService suppliertypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Suppliertype selectOne(Integer id) {
        return this.suppliertypeService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Suppliertype> selectAll(){
           return this.suppliertypeService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param suppliertype 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Suppliertype>  queryAll(Suppliertype suppliertype){
           return this.suppliertypeService.queryAll(suppliertype);
    }

}