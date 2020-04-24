package com.code.controller;

import com.code.entity.Otheroutware;
import com.code.service.OtheroutwareService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Otheroutware)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@RestController
@RequestMapping("otheroutware")
public class OtheroutwareController {
    /**
     * 服务对象
     */
    @Resource
    private OtheroutwareService otheroutwareService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Otheroutware selectOne(Integer id) {
        return this.otheroutwareService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Otheroutware> selectAll(){
           return this.otheroutwareService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param otheroutware 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Otheroutware>  queryAll(Otheroutware otheroutware){
           return this.otheroutwareService.queryAll(otheroutware);
    }

}