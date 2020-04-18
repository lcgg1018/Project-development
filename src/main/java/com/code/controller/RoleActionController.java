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
 * @since 2020-04-19 02:16:42
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
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<RoleAction> selectAll(){
           return this.roleActionService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param roleAction 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<RoleAction>  queryAll(RoleAction roleAction){
           return this.roleActionService.queryAll(roleAction);
    }

}