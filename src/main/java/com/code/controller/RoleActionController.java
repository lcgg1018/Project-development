package com.code.controller;

import com.code.entity.RoleAction;
import com.code.service.RoleActionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (RoleAction)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@RestController
@RequestMapping("roleAction")
public class RoleActionController {
    /**
     * 服务对象
     */
    @Resource
    private RoleActionService roleActionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public RoleAction selectOne(Integer id) {
        return this.roleActionService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<RoleAction> selectAll(){
           return this.roleActionService.selectAll();
    }

}