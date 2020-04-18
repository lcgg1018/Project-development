package com.code.controller;

import com.code.entity.Category;
import com.code.service.CategoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * 客户类别(Category)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    /**
     * 服务对象
     */
    @Resource
    private CategoryService categoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Category selectOne(String id) {
        return this.categoryService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Category> selectAll(){
           return this.categoryService.selectAll();
    }

}