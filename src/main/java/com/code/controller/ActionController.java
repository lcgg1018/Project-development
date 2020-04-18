package com.code.controller;

import com.code.entity.Action;
import com.code.service.ActionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Action)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
@RestController
@RequestMapping("action")
public class ActionController {
    /**
     * 服务对象
     */
    @Resource
    private ActionService actionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Action selectOne(Integer id) {
        return this.actionService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Action> selectAll(){
           return this.actionService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param action 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Action>  queryAll(Action action){
           return this.actionService.queryAll(action);
    }

}