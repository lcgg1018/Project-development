package com.code.entity;

import java.io.Serializable;

/**
 * 客户类别(Category)实体类
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
public class Category implements Serializable {
    private static final long serialVersionUID = -54519282873452463L;
    /**
    * 类别编号
    */
    private String cid;
    /**
    * 类别名称
    */
    private String name;


    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}