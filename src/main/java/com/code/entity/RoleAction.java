package com.code.entity;

import java.io.Serializable;

/**
 * (RoleAction)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:41
 */
public class RoleAction implements Serializable {
    private static final long serialVersionUID = -95190841720034163L;
    /**
    * id
    */
    private Integer id;
    /**
    * 角色id
    */
    private Integer roleId;
    /**
    * 权限id
    */
    private Integer actionId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

}