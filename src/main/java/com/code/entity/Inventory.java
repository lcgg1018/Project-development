package com.code.entity;

import java.io.Serializable;

/**
 * (Inventory)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public class Inventory implements Serializable {
    private static final long serialVersionUID = 402966067816310024L;
    /**
    * 盘点编号
    */
    private Integer inventoryid;
    /**
    * 仓库
    */
    private Integer wareid;
    /**
    * 商品类别
    */
    private Integer typeid;
    /**
    * 商品id
    */
    private Integer productid;
    /**
    * 商品名称
    */
    private String productname;
    /**
    * 单位
    */
    private String unitrequire;
    /**
    * 系统库存
    */
    private Integer sysnum;
    /**
    * 盘点库存
    */
    private Integer inventorynum;
    /**
    * 盘盈盘亏
    */
    private String inventorydetails;


    public Integer getInventoryid() {
        return inventoryid;
    }

    public void setInventoryid(Integer inventoryid) {
        this.inventoryid = inventoryid;
    }

    public Integer getWareid() {
        return wareid;
    }

    public void setWareid(Integer wareid) {
        this.wareid = wareid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getUnitrequire() {
        return unitrequire;
    }

    public void setUnitrequire(String unitrequire) {
        this.unitrequire = unitrequire;
    }

    public Integer getSysnum() {
        return sysnum;
    }

    public void setSysnum(Integer sysnum) {
        this.sysnum = sysnum;
    }

    public Integer getInventorynum() {
        return inventorynum;
    }

    public void setInventorynum(Integer inventorynum) {
        this.inventorynum = inventorynum;
    }

    public String getInventorydetails() {
        return inventorydetails;
    }

    public void setInventorydetails(String inventorydetails) {
        this.inventorydetails = inventorydetails;
    }

}