package com.code.entity;

import java.io.Serializable;

/**
 * (Transfersorder)实体类
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public class Transfersorder implements Serializable {
    private static final long serialVersionUID = -17611988903915361L;
    /**
    * 调拨单ID
    */
    private Integer transfersorderid;
    /**
    * 商品id
    */
    private Integer pid;
    /**
    * 单位
    */
    private String unitrequire;
    /**
    * 数量
    */
    private Integer num;
    /**
    * 调出仓库
    */
    private Integer outware;
    /**
    * 调入仓库
    */
    private Integer inware;
    /**
    * 备注
    */
    private String details;


    public Integer getTransfersorderid() {
        return transfersorderid;
    }

    public void setTransfersorderid(Integer transfersorderid) {
        this.transfersorderid = transfersorderid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUnitrequire() {
        return unitrequire;
    }

    public void setUnitrequire(String unitrequire) {
        this.unitrequire = unitrequire;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getOutware() {
        return outware;
    }

    public void setOutware(Integer outware) {
        this.outware = outware;
    }

    public Integer getInware() {
        return inware;
    }

    public void setInware(Integer inware) {
        this.inware = inware;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}