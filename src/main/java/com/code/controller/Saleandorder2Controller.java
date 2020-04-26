package com.code.controller;

import com.code.entity.Saleandorder2;
import com.code.service.Saleandorder2Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Saleandorder2)表控制层
 *
 * @author yap
 * @since 2020-04-26 16:29:19
 */
@RestController
@RequestMapping("saleandorder2")
public class Saleandorder2Controller {
    /**
     * 服务对象
     */
    @Resource
    private Saleandorder2Service saleandorder2Service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Saleandorder2 selectOne(Integer id) {
        return this.saleandorder2Service.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Saleandorder2> selectAll(){
           return this.saleandorder2Service.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param saleandorder2 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Saleandorder2>  queryAll(Saleandorder2 saleandorder2){
           return this.saleandorder2Service.queryAll(saleandorder2);
    }

}