package com.code.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public class User implements Serializable {
    private static final long serialVersionUID = 846611426574539669L;
    /**
    * 用户编号
    */
    private Integer id;
    /**
    * 用户名
    */
    private String name;
    /**
    * 密码
    */
    private String password;
    /**
    * 盐值
    */
    private String salt;
    /**
    * 电话号码
    */
    private String telephone;
    /**
    * 邮箱
    */
    private String mail;
    /**
    * 用户状态
    */
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}