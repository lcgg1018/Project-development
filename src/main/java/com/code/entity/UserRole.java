package com.code.entity;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public class UserRole implements Serializable {
    private static final long serialVersionUID = 949454290323571683L;
    /**
    * id
    */
    private Integer id;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 角色id
    */
    private Integer rolrId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRolrId() {
        return rolrId;
    }

    public void setRolrId(Integer rolrId) {
        this.rolrId = rolrId;
    }

}