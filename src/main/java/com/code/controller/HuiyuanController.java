package com.code.controller;

import com.code.entity.Huiyuan;
import com.code.service.HuiyuanService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Huiyuan)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("huiyuan")
public class HuiyuanController {
    /**
     * 服务对象
     */
    @Resource
    private HuiyuanService huiyuanService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Huiyuan selectOne(String id) {
        return this.huiyuanService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Huiyuan> selectAll(){
           return this.huiyuanService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param huiyuan 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Huiyuan>  queryAll(Huiyuan huiyuan){
           return this.huiyuanService.queryAll(huiyuan);
    }

}