package com.code.controller;

import com.code.entity.Xiaofei;
import com.code.service.XiaofeiService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * 会员消费记录表(Xiaofei)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:41
 */
@RestController
@RequestMapping("xiaofei")
public class XiaofeiController {
    /**
     * 服务对象
     */
    @Resource
    private XiaofeiService xiaofeiService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Xiaofei selectOne(String id) {
        return this.xiaofeiService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Xiaofei> selectAll(){
           return this.xiaofeiService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param xiaofei 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Xiaofei>  queryAll(Xiaofei xiaofei){
           return this.xiaofeiService.queryAll(xiaofei);
    }

}