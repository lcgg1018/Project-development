package com.code.controller;

import com.code.entity.Dengji;
import com.code.service.DengjiService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Dengji)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("dengji")
public class DengjiController {
    /**
     * 服务对象
     */
    @Resource
    private DengjiService dengjiService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Dengji selectOne(Integer id) {
        return this.dengjiService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Dengji> selectAll(){
           return this.dengjiService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param dengji 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Dengji>  queryAll(Dengji dengji){
           return this.dengjiService.queryAll(dengji);
    }

}