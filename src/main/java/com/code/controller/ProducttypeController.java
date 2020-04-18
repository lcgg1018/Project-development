package com.code.controller;

import com.code.entity.Producttype;
import com.code.service.ProducttypeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Producttype)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:55
 */
@RestController
@RequestMapping("producttype")
public class ProducttypeController {
    /**
     * 服务对象
     */
    @Resource
    private ProducttypeService producttypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Producttype selectOne(Integer id) {
        return this.producttypeService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Producttype> selectAll(){
           return this.producttypeService.selectAll();
    }

}