package com.code.controller;

import com.code.entity.Role;
import com.code.service.RoleService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Role)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:43
 */
@RestController
@RequestMapping("role")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Role selectOne(Integer id) {
        return this.roleService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Role> selectAll(){
           return this.roleService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param role 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Role>  queryAll(Role role){
           return this.roleService.queryAll(role);
    }

}