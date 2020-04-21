package com.code.entity;


public class SupplierStatement {

  private String supplierId;
  private String invoicesNum;
  private java.sql.Timestamp invoicesDate;
  private String businessCategory;
  private double purchaseAmount;
  private double discountAmount;
  private double amountReceivable;
  private double actualAmountReceived;
  private double receivableBalance;
  private String remark;


  public String getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(String supplierId) {
    this.supplierId = supplierId;
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


  public double getPurchaseAmount() {
    return purchaseAmount;
  }

  public void setPurchaseAmount(double purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
  }


  public double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(double discountAmount) {
    this.discountAmount = discountAmount;
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
