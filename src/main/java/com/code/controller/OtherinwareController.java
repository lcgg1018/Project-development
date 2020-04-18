package com.code.controller;

import com.code.entity.Otherinware;
import com.code.service.OtherinwareService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Otherinware)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
@RestController
@RequestMapping("otherinware")
public class OtherinwareController {
    /**
     * 服务对象
     */
    @Resource
    private OtherinwareService otherinwareService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Otherinware selectOne(Integer id) {
        return this.otherinwareService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Otherinware> selectAll(){
           return this.otherinwareService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param otherinware 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Otherinware>  queryAll(Otherinware otherinware){
           return this.otherinwareService.queryAll(otherinware);
    }

}