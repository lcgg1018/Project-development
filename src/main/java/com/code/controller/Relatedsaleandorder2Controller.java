package com.code.controller;

import com.code.entity.Relatedsaleandorder2;
import com.code.service.Relatedsaleandorder2Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Relatedsaleandorder2)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:41
 */
@RestController
@RequestMapping("relatedsaleandorder2")
public class Relatedsaleandorder2Controller {
    /**
     * 服务对象
     */
    @Resource
    private Relatedsaleandorder2Service relatedsaleandorder2Service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Relatedsaleandorder2 selectOne(Integer id) {
        return this.relatedsaleandorder2Service.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Relatedsaleandorder2> selectAll(){
           return this.relatedsaleandorder2Service.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param relatedsaleandorder2 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Relatedsaleandorder2>  queryAll(Relatedsaleandorder2 relatedsaleandorder2){
           return this.relatedsaleandorder2Service.queryAll(relatedsaleandorder2);
    }

}