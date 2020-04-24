package com.code.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Supplier)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
public class Supplier implements Serializable {
    private static final long serialVersionUID = 642813231518934122L;
    /**
    * 供应商id
    */
    private Integer sid;
    /**
    * 供应商编号
    */
    private String sno;
    /**
    * 供应商类型id
    */
    private Integer stypeid;
    /**
    * 供应商名字
    */
    private String sname;
    /**
    * 首要联系人
    */
    private String scontacts;
    /**
    * 手机号码
    */
    private Integer pnumber;
    /**
    * 座机号码
    */
    private Integer lnumber;
    /**
    * 联系方式
    */
    private String cinformation;
    /**
    * 联系地址
    */
    private String caddress;
    /**
    * 日期
    */
    private Date sdate;
    /**
    * 期初应付款
    */
    private String opayables;
    /**
    * 期初预付款
    */
    private String oprepayment;
    /**
    * 增值税税率
    */
    private String vatrate;
    /**
    * 纳税人识别号
    */
    private String tinumber;
    /**
    * 开户银行
    */
    private String bank;
    /**
    * 银行账号
    */
    private Integer bankaccount;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public Integer getStypeid() {
        return stypeid;
    }

    public void setStypeid(Integer stypeid) {
        this.stypeid = stypeid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScontacts() {
        return scontacts;
    }

    public void setScontacts(String scontacts) {
        this.scontacts = scontacts;
    }

    public Integer getPnumber() {
        return pnumber;
    }

    public void setPnumber(Integer pnumber) {
        this.pnumber = pnumber;
    }

    public Integer getLnumber() {
        return lnumber;
    }

    public void setLnumber(Integer lnumber) {
        this.lnumber = lnumber;
    }

    public String getCinformation() {
        return cinformation;
    }

    public void setCinformation(String cinformation) {
        this.cinformation = cinformation;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public String getOpayables() {
        return opayables;
    }

    public void setOpayables(String opayables) {
        this.opayables = opayables;
    }

    public String getOprepayment() {
        return oprepayment;
    }

    public void setOprepayment(String oprepayment) {
        this.oprepayment = oprepayment;
    }

    public String getVatrate() {
        return vatrate;
    }

    public void setVatrate(String vatrate) {
        this.vatrate = vatrate;
    }

    public String getTinumber() {
        return tinumber;
    }

    public void setTinumber(String tinumber) {
        this.tinumber = tinumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Integer getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(Integer bankaccount) {
        this.bankaccount = bankaccount;
    }

}