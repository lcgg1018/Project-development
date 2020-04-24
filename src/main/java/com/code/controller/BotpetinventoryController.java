package com.code.controller;

import com.code.entity.Botpetinventory;
import com.code.service.BotpetinventoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Botpetinventory)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@RestController
@RequestMapping("botpetinventory")
public class BotpetinventoryController {
    /**
     * 服务对象
     */
    @Resource
    private BotpetinventoryService botpetinventoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Botpetinventory selectOne(Integer id) {
        return this.botpetinventoryService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Botpetinventory> selectAll(){
           return this.botpetinventoryService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param botpetinventory 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Botpetinventory>  queryAll(Botpetinventory botpetinventory){
           return this.botpetinventoryService.queryAll(botpetinventory);
    }

}