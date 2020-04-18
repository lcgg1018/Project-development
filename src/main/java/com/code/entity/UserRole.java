package com.code.entity;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public class UserRole implements Serializable {
    private static final long serialVersionUID = 341793460168651173L;
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