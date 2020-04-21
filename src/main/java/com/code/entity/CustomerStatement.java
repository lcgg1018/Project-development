package com.code.entity;


public class CustomerStatement {

  private long clienteleId;
  private String invoicesNum;
  private java.sql.Timestamp invoicesDate;
  private String businessCategory;
  private String sourceListNum;
  private double salesAmount;
  private double discountAmount;
  private double payThePiper;
  private double amountReceivable;
  private double actualAmountReceived;
  private double receivableBalance;
  private String remark;


  public long getClienteleId() {
    return clienteleId;
  }

  public void setClienteleId(long clienteleId) {
    this.clienteleId = clienteleId;
  }


  public String getInvoicesNum() {
    return invoicesNum;
  }

  public void setInvoicesNum(String invoicesNum) {
    this.invoicesNum = invoicesNum;
  }


  public java.sql.Timestamp getInvoicesDate() {
    return invoicesDate;
  }

  public void setInvoicesDate(java.sql.Timestamp invoicesDate) {
    this.invoicesDate = invoicesDate;
  }


  public String getBusinessCategory() {
    return businessCategory;
  }

  public void setBusinessCategory(String businessCategory) {
    this.businessCategory = businessCategory;
  }


  public String getSourceListNum() {
    return sourceListNum;
  }

  public void setSourceListNum(String sourceListNum) {
    this.sourceListNum = sourceListNum;
  }


  public double getSalesAmount() {
    return salesAmount;
  }

  public void setSalesAmount(double salesAmount) {
    this.salesAmount = salesAmount;
  }


  public double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(double discountAmount) {
    this.discountAmount = discountAmount;
  }


  public double getPayThePiper() {
    return payThePiper;
  }

  public void setPayThePiper(double payThePiper) {
    this.payThePiper = payThePiper;
  }


  public double getAmountReceivable() {
    return amountReceivable;
  }

  public void setAmountReceivable(double amountReceivable) {
    this.amountReceivable = amountReceivable;
  }


  public double getActualAmountReceived() {
    return actualAmountReceived;
  }

  public void setActualAmountReceived(double actualAmountReceived) {
    this.actualAmountReceived = actualAmountReceived;
  }


  public double getReceivableBalance() {
    return receivableBalance;
  }

  public void setReceivableBalance(double receivableBalance) {
    this.receivableBalance = receivableBalance;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
