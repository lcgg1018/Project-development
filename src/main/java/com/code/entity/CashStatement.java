package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 现金银行报表
 */
@NoArgsConstructor@AllArgsConstructor
public class CashStatement {
  /***
   *账户编号
   */
  private long accountId;
  /***
   *日期
   */
  private java.sql.Timestamp date;
  /***
   * 单据编号
   */
  private String invoicesNum;
  /***
   * 业务类型
   */
  private String businessType;
  /***
   * 收入
   */
  private double income;
  /***
   * 支出
   */
  private double disburse;
  /***
   *账户余额
   */
  private double accountBalance;
  /***
   *客户编号/供应商编号
   */
  private String dealings;
  /***
   *收款人
   */
  private String payee;
  /***
   *备注
   */
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
