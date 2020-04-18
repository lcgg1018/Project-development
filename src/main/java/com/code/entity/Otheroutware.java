package com.code.entity;

import java.io.Serializable;

/**
 * (Otheroutware)实体类
 *
 * @author yap
 * @since 2020-04-18 16:52:55
 */
public class Otheroutware implements Serializable {
    private static final long serialVersionUID = 931371907447387688L;
    /**
    * 其他出库订单编号
    */
    private Integer otheroutwareid;
    /**
    * 商品id
    */
    private Integer productid;
    /**
    * 单位
    */
    private String unitrequire;
    /**
    * 仓库id
    */
    private Integer wareid;
    /**
    * 数量
    */
    private Integer num;
    /**
    * 出库单价
    */
    private Double outprice;
    /**
    * 出库总金额
    */
    private Double outcount;
    /**
    * 备注
    */
    private String details;


    public Integer getOtheroutwareid() {
        return otheroutwareid;
    }

    public void setOtheroutwareid(Integer otheroutwareid) {
        this.otheroutwareid = otheroutwareid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getUnitrequire() {
        return unitrequire;
    }

    public void setUnitrequire(String unitrequire) {
        this.unitrequire = unitrequire;
    }

    public Integer getWareid() {
        return wareid;
    }

    public void setWareid(Integer wareid) {
        this.wareid = wareid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getOutprice() {
        return outprice;
    }

    public void setOutprice(Double outprice) {
        this.outprice = outprice;
    }

    public Double getOutcount() {
        return outcount;
    }

    public void setOutcount(Double outcount) {
        this.outcount = outcount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}