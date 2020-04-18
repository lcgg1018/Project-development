package com.code.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 会员卡信息表(Huiyuankai)实体类
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
public class Huiyuankai implements Serializable {
    private static final long serialVersionUID = 372238878544963398L;
    /**
    * 会员卡卡号，主键
    */
    private String hykkh;
    /**
    * 等级编号，外键
    */
    private Integer hykdjid;
    /**
    * 注册时间
    */
    private Date hyktime;


    public String getHykkh() {
        return hykkh;
    }

    public void setHykkh(String hykkh) {
        this.hykkh = hykkh;
    }

    public Integer getHykdjid() {
        return hykdjid;
    }

    public void setHykdjid(Integer hykdjid) {
        this.hykdjid = hykdjid;
    }

    public Date getHyktime() {
        return hyktime;
    }

    public void setHyktime(Date hyktime) {
        this.hyktime = hyktime;
    }

}