package com.code.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Invoice)实体类
 *
 * @author yap
 * @since 2020-04-18 23:17:18
 */
public class Invoice implements Serializable {
    private static final long serialVersionUID = 612524564792980494L;
    
    private Integer id;
    
    private Date idate;
    /**
    * 单据编号
    */
    private String ordernumber;
    /**
    * 客户
    */
    private String customername;
    /**
    * 金额
    */
    private String iprice;
    /**
    * 已开票金额
    */
    private String invoicedamount;
    /**
    * 未开票金额
    */
    private String amountnotinvoiced;
    /**
    * 本次开票金额
    */
    private String currentinvoiceamount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getIdate() {
        return idate;
    }

    public void setIdate(Date idate) {
        this.idate = idate;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getIprice() {
        return iprice;
    }

    public void setIprice(String iprice) {
        this.iprice = iprice;
    }

    public String getInvoicedamount() {
        return invoicedamount;
    }

    public void setInvoicedamount(String invoicedamount) {
        this.invoicedamount = invoicedamount;
    }

    public String getAmountnotinvoiced() {
        return amountnotinvoiced;
    }

    public void setAmountnotinvoiced(String amountnotinvoiced) {
        this.amountnotinvoiced = amountnotinvoiced;
    }

    public String getCurrentinvoiceamount() {
        return currentinvoiceamount;
    }

    public void setCurrentinvoiceamount(String currentinvoiceamount) {
        this.currentinvoiceamount = currentinvoiceamount;
    }

}