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
 * @since 2020-04-18 16:52:56
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
    
    @RequestMapping("selectAll")
    public List<Suppliertype> selectAll(){
           return this.suppliertypeService.selectAll();
    }

}