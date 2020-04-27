package com.code.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Saleandorder)实体类
 *
 * @author yap
 * @since 2020-04-26 16:29:19
 */
public class Saleandorder implements Serializable {
    private static final long serialVersionUID = -65685161685766279L;
    
    private Integer sid;
    /**
    * 类别
    */
    private String category;
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
    * 交货日期
    */
    private Date rdate;
    /**
    * 编号
    */
    private String ordernumber;
    
    private String ordernumber2;
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


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getOrdernumber2() {
        return ordernumber2;
    }

    public void setOrdernumber2(String ordernumber2) {
        this.ordernumber2 = ordernumber2;
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

}