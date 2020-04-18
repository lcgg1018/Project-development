package com.code.entity;

import java.io.Serializable;

/**
 * (Relatedsaleandorder2)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:41
 */
public class Relatedsaleandorder2 implements Serializable {
    private static final long serialVersionUID = 808977704659419501L;
    
    private Integer rid;
    /**
    * 编号
    */
    private String ordernumber;
    
    private String rname;
    /**
    * 单位
    */
    private String sunit;
    /**
    * 价格
    */
    private String sprice;
    /**
    * 数量
    */
    private String scount;
    /**
    * 税率
    */
    private String stax;
    /**
    * 仓库
    */
    private Integer wid;
    
    private String sdiscount;
    /**
    * 总价
    */
    private String stotal;
    /**
    * 备注
    */
    private String remarks;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getSunit() {
        return sunit;
    }

    public void setSunit(String sunit) {
        this.sunit = sunit;
    }

    public String getSprice() {
        return sprice;
    }

    public void setSprice(String sprice) {
        this.sprice = sprice;
    }

    public String getScount() {
        return scount;
    }

    public void setScount(String scount) {
        this.scount = scount;
    }

    public String getStax() {
        return stax;
    }

    public void setStax(String stax) {
        this.stax = stax;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getSdiscount() {
        return sdiscount;
    }

    public void setSdiscount(String sdiscount) {
        this.sdiscount = sdiscount;
    }

    public String getStotal() {
        return stotal;
    }

    public void setStotal(String stotal) {
        this.stotal = stotal;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}