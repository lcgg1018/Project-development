package com.code.controller;

import com.code.entity.Transfersorder;
import com.code.service.TransfersorderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Transfersorder)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@RestController
@RequestMapping("transfersorder")
public class TransfersorderController {
    /**
     * 服务对象
     */
    @Resource
    private TransfersorderService transfersorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Transfersorder selectOne(Integer id) {
        return this.transfersorderService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Transfersorder> selectAll(){
           return this.transfersorderService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param transfersorder 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Transfersorder>  queryAll(Transfersorder transfersorder){
           return this.transfersorderService.queryAll(transfersorder);
    }

}