package com.code.controller;

import com.code.entity.UserRole;
import com.code.service.UserRoleService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (UserRole)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("userRole")
public class UserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private UserRoleService userRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserRole selectOne(Integer id) {
        return this.userRoleService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<UserRole> selectAll(){
           return this.userRoleService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param userRole 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<UserRole>  queryAll(UserRole userRole){
           return this.userRoleService.queryAll(userRole);
    }

}