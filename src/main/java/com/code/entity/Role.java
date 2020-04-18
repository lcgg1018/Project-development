package com.code.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 287369536229077939L;
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