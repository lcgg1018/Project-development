package com.code.entity;


public class CashStatement {

  private long accountId;
  private java.sql.Timestamp date;
  private String invoicesNum;
  private String businessType;
  private double income;
  private double disburse;
  private double accountBalance;
  private String dealings;
  private String payee;
  private String remark;


  public long getAccountId() {
    return accountId;
  }

  public void setAccountId(long accountId) {
    this.accountId = accountId;
  }


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }


  public String getInvoicesNum() {
    return invoicesNum;
  }

  public void setInvoicesNum(String invoicesNum) {
    this.invoicesNum = invoicesNum;
  }


  public String getBusinessType() {
    return businessType;
  }

  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }


  public double getIncome() {
    return income;
  }

  public void setIncome(double income) {
    this.income = income;
  }


  public double getDisburse() {
    return disburse;
  }

  public void setDisburse(double disburse) {
    this.disburse = disburse;
  }


  public double getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(double accountBalance) {
    this.accountBalance = accountBalance;
  }


  public String getDealings() {
    return dealings;
  }

  public void setDealings(String dealings) {
    this.dealings = dealings;
  }


  public String getPayee() {
    return payee;
  }

  public void setPayee(String payee) {
    this.payee = payee;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
