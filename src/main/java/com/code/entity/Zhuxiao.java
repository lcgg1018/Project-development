package com.code.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 会员卡注销表(Zhuxiao)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public class Zhuxiao implements Serializable {
    private static final long serialVersionUID = -42805668269991269L;
    /**
    * 会员卡卡号，主键
    */
    private String hykkh;
    /**
    * 注销时间
    */
    private Date zxtime;


    public String getHykkh() {
        return hykkh;
    }

    public void setHykkh(String hykkh) {
        this.hykkh = hykkh;
    }

    public Date getZxtime() {
        return zxtime;
    }

    public void setZxtime(Date zxtime) {
        this.zxtime = zxtime;
    }

}