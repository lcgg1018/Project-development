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
 * @since 2020-04-18 16:52:54
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
    
    @RequestMapping("selectAll")
    public List<Action> selectAll(){
           return this.actionService.selectAll();
    }

}