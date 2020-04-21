package com.code.entity;


public class Profit {

  private java.sql.Timestamp date;
  private double salesRevenue;
  private double salesDiscount;
  private double salesCollectionDiscount;
  private double sellingCost;
  private double sellingDiscountAmount;
  private double sellingPaymentDiscount;
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
