package com.code.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 213766853102716378L;
    /**
    * 角色id
    */
    private Integer id;
    /**
    * 角色名称
    */
    private String roleName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}