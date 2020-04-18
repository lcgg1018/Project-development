package com.code.entity;

import java.io.Serializable;

/**
 * (Purchase)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public class Purchase implements Serializable {
    private static final long serialVersionUID = 455806080762855787L;
    /**
    * 单据编号
    */
    private Integer purchaseId;
    /**
    * 负责人
    */
    private String usersId;
    /**
    * 审核人
    */
    private String bossUsersId;
    /**
    * supplier_id 供货商id
    */
    private String supplierId;
    /**
    * 商品id
    */
    private Integer purchaseGoodsId;
    /**
    * 商品名称
    */
    private String purchaseGoodsName;
    /**
    * 审核状态
    */
    private String purchaseStatus;
    /**
    * 价格
    */
    private Integer purchasePrice;
    /**
    * 数量
    */
    private Integer purchaseNum;
    /**
    * 单据日期
    */
    private String pruchaseDate;
    /**
    * 备注
    */
    private String commet;
    /**
    * 仓库
    */
    private String warehouse;
    /**
    * 关联销货订单
    */
    private String xhOrders;
    /**
    * 优惠率
    */
    private String discounts;
    /**
    * 优惠后金额
    */
    private Integer discountsSum;
    /**
    * 付款状态
    */
    private String paymentStatus;
    /**
    * 单位
    */
    private String purchaseUnit;


    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getUsersId() {
        return usersId;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }

    public String getBossUsersId() {
        return bossUsersId;
    }

    public void setBossUsersId(String bossUsersId) {
        this.bossUsersId = bossUsersId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getPurchaseGoodsId() {
        return purchaseGoodsId;
    }

    public void setPurchaseGoodsId(Integer purchaseGoodsId) {
        this.purchaseGoodsId = purchaseGoodsId;
    }

    public String getPurchaseGoodsName() {
        return purchaseGoodsName;
    }

    public void setPurchaseGoodsName(String purchaseGoodsName) {
        this.purchaseGoodsName = purchaseGoodsName;
    }

    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public String getPruchaseDate() {
        return pruchaseDate;
    }

    public void setPruchaseDate(String pruchaseDate) {
        this.pruchaseDate = pruchaseDate;
    }

    public String getCommet() {
        return commet;
    }

    public void setCommet(String commet) {
        this.commet = commet;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getXhOrders() {
        return xhOrders;
    }

    public void setXhOrders(String xhOrders) {
        this.xhOrders = xhOrders;
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts;
    }

    public Integer getDiscountsSum() {
        return discountsSum;
    }

    public void setDiscountsSum(Integer discountsSum) {
        this.discountsSum = discountsSum;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPurchaseUnit() {
        return purchaseUnit;
    }

    public void setPurchaseUnit(String purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

}