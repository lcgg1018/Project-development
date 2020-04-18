package com.code.entity;

import java.io.Serializable;

/**
 * (Address)实体类
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
public class Address implements Serializable {
    private static final long serialVersionUID = -81693512331029597L;
    /**
    * 地址简称
    */
    private String aabbreviation;
    /**
    * 联系电话
    */
    private String phone;
    /**
    * 手机号码
    */
    private Integer myphone;
    /**
    * 邮政编码
    */
    private String pcode;
    /**
    * 联系人
    */
    private String contacts;
    /**
    * 默认地址
    */
    private String status;
    /**
    * 省
    */
    private String province;
    /**
    * 市
    */
    private String city;
    /**
    * 区
    */
    private String area;
    /**
    * 详细地址
    */
    private String detailedaddress;


    public String getAabbreviation() {
        return aabbreviation;
    }

    public void setAabbreviation(String aabbreviation) {
        this.aabbreviation = aabbreviation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getMyphone() {
        return myphone;
    }

    public void setMyphone(Integer myphone) {
        this.myphone = myphone;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDetailedaddress() {
        return detailedaddress;
    }

    public void setDetailedaddress(String detailedaddress) {
        this.detailedaddress = detailedaddress;
    }

}