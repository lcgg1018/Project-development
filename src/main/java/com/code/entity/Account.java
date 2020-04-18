package com.code.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Account)实体类
 *
 * @author yap
 * @since 2020-04-18 16:51:02
 */
public class Account implements Serializable {
    private static final long serialVersionUID = 799190851398667960L;
    /**
    * 账户id
    */
    private Integer aid;
    /**
    * 账户编号
    */
    private String ano;
    
    private String aname;
    /**
    * 余额日期
    */
    private Date adate;
    /**
    * 期初余额
    */
    private Object ibalance;
    /**
    * 账户类别
    */
    private String atype;


    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Date getAdate() {
        return adate;
    }

    public void setAdate(Date adate) {
        this.adate = adate;
    }

    public Object getIbalance() {
        return ibalance;
    }

    public void setIbalance(Object ibalance) {
        this.ibalance = ibalance;
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

}