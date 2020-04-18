package com.code.controller;

import com.code.entity.Product;
import com.code.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Product)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:55
 */
@RestController
@RequestMapping("product")
public class ProductController {
    /**
     * 服务对象
     */
    @Resource
    private ProductService productService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Product selectOne(Integer id) {
        return this.productService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Product> selectAll(){
           return this.productService.selectAll();
    }

}