package com.code.entity;

import java.io.Serializable;

/**
 * (Otherinware)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public class Otherinware implements Serializable {
    private static final long serialVersionUID = 950297942420453245L;
    /**
    * 其他入库订单编号
    */
    private Integer otherinwareid;
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
    * 入库单价
    */
    private Double inprice;
    /**
    * 入库总金额
    */
    private Double incount;
    /**
    * 备注
    */
    private String details;


    public Integer getOtherinwareid() {
        return otherinwareid;
    }

    public void setOtherinwareid(Integer otherinwareid) {
        this.otherinwareid = otherinwareid;
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

    public Double getInprice() {
        return inprice;
    }

    public void setInprice(Double inprice) {
        this.inprice = inprice;
    }

    public Double getIncount() {
        return incount;
    }

    public void setIncount(Double incount) {
        this.incount = incount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}