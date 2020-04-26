package com.code.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Saleandorder2)实体类
 *
 * @author yap
 * @since 2020-04-26 16:29:19
 */
public class Saleandorder2 implements Serializable {
    private static final long serialVersionUID = -89556632656576727L;
    
    private Integer sid;
    /**
    * 销售人员
    */
    private String salesman;
    /**
    * 客户
    */
    private String customername;
    /**
    * 状态
    */
    private String status;
    /**
    * 单据日期
    */
    private Date sdate;
    /**
    * 编号
    */
    private String ordernumber;
    /**
    * 备注
    */
    private String remarks;
    /**
    * 总价
    */
    private String stotal;
    /**
    * 制单人
    */
    private String author;
    /**
    * 审核人
    */
    private String inspect;
    /**
    * 地址
    */
    private String address;
    /**
    * 支付方式
    */
    private String paymethod;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStotal() {
        return stotal;
    }

    public void setStotal(String stotal) {
        this.stotal = stotal;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInspect() {
        return inspect;
    }

    public void setInspect(String inspect) {
        this.inspect = inspect;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

}