package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 利润详细
 */
@NoArgsConstructor
@AllArgsConstructor
public class Profit {
    /***
     *日期
     */
    private java.sql.Timestamp date;
    /***
     *销售收入金额
     */
    private double salesRevenue;
    /***
     *减：销售优惠金额
     */
    private double salesDiscount;
    /***
     *减：收款折扣
     */
    private double salesCollectionDiscount;
    /***
     *销售成本
     */
    private double sellingCost;
    /***
     *销售：买货优惠金额
     */
    private double sellingDiscountAmount;
    /***
     *减：付款折扣
     */
    private double sellingPaymentDiscount;
    /***
     *净利润
     */
    private double retainedProfits;


    public java.sql.Timestamp getDate() {
        return date;
    }

    public void setDate(java.sql.Timestamp date) {
        this.date = date;
    }


    public double getSalesRevenue() {
        return salesRevenue;
    }

    public void setSalesRevenue(double salesRevenue) {
        this.salesRevenue = salesRevenue;
    }


    public double getSalesDiscount() {
        return salesDiscount;
    }

    public void setSalesDiscount(double salesDiscount) {
        this.salesDiscount = salesDiscount;
    }


    public double getSalesCollectionDiscount() {
        return salesCollectionDiscount;
    }

    public void setSalesCollectionDiscount(double salesCollectionDiscount) {
        this.salesCollectionDiscount = salesCollectionDiscount;
    }


    public double getSellingCost() {
        return sellingCost;
    }

    public void setSellingCost(double sellingCost) {
        this.sellingCost = sellingCost;
    }


    public double getSellingDiscountAmount() {
        return sellingDiscountAmount;
    }

    public void setSellingDiscountAmount(double sellingDiscountAmount) {
        this.sellingDiscountAmount = sellingDiscountAmount;
    }


    public double getSellingPaymentDiscount() {
        return sellingPaymentDiscount;
    }

    public void setSellingPaymentDiscount(double sellingPaymentDiscount) {
        this.sellingPaymentDiscount = sellingPaymentDiscount;
    }


    public double getRetainedProfits() {
        return retainedProfits;
    }

    public void setRetainedProfits(double retainedProfits) {
        this.retainedProfits = retainedProfits;
    }

}
