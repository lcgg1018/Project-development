package com.code.entity;

import java.io.Serializable;

/**
 * 会员消费记录表(Xiaofei)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:41
 */
public class Xiaofei implements Serializable {
    private static final long serialVersionUID = -34720252660632525L;
    /**
    * 会员卡卡号，主键
    */
    private String hykid;
    /**
    * 商品编号，主键
    */
    private Integer spid;
    /**
    * 购买数量
    */
    private Integer xfsl;


    public String getHykid() {
        return hykid;
    }

    public void setHykid(String hykid) {
        this.hykid = hykid;
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Integer getXfsl() {
        return xfsl;
    }

    public void setXfsl(Integer xfsl) {
        this.xfsl = xfsl;
    }

}