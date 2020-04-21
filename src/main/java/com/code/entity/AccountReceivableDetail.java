package com.code.entity;


public class AccountReceivableDetail {

  private long clienteleId;
  private java.sql.Timestamp invoicesDate;
  private String invoicesNum;
  private double increaseDue;
  private double advancePaymentIncrease;
  private double balancePayable;
  private String remark;


  public long getClienteleId() {
    return clienteleId;
  }

  public void setClienteleId(long clienteleId) {
    this.clienteleId = clienteleId;
  }


  public java.sql.Timestamp getInvoicesDate() {
    return invoicesDate;
  }

  public void setInvoicesDate(java.sql.Timestamp invoicesDate) {
    this.invoicesDate = invoicesDate;
  }


  public String getInvoicesNum() {
    return invoicesNum;
  }

  public void setInvoicesNum(String invoicesNum) {
    this.invoicesNum = invoicesNum;
  }


  public double getIncreaseDue() {
    return increaseDue;
  }

  public void setIncreaseDue(double increaseDue) {
    this.increaseDue = increaseDue;
  }


  public double getAdvancePaymentIncrease() {
    return advancePaymentIncrease;
  }

  public void setAdvancePaymentIncrease(double advancePaymentIncrease) {
    this.advancePaymentIncrease = advancePaymentIncrease;
  }


  public double getBalancePayable() {
    return balancePayable;
  }

  public void setBalancePayable(double balancePayable) {
    this.balancePayable = balancePayable;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
