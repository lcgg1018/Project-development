package com.code.entity;

import java.io.Serializable;

/**
 * (Producttype)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public class Producttype implements Serializable {
    private static final long serialVersionUID = -56810571555260576L;
    /**
    * 商品类别id
    */
    private Integer producttypeid;
    /**
    * 商品类别名称
    */
    private String producttypename;


    public Integer getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(Integer producttypeid) {
        this.producttypeid = producttypeid;
    }

    public String getProducttypename() {
        return producttypename;
    }

    public void setProducttypename(String producttypename) {
        this.producttypename = producttypename;
    }

}