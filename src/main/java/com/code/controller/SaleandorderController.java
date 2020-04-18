package com.code.controller;

import com.code.entity.Saleandorder;
import com.code.service.SaleandorderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Saleandorder)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@RestController
@RequestMapping("saleandorder")
public class SaleandorderController {
    /**
     * 服务对象
     */
    @Resource
    private SaleandorderService saleandorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Saleandorder selectOne(Integer id) {
        return this.saleandorderService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Saleandorder> selectAll(){
           return this.saleandorderService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param saleandorder 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Saleandorder>  queryAll(Saleandorder saleandorder){
           return this.saleandorderService.queryAll(saleandorder);
    }

}