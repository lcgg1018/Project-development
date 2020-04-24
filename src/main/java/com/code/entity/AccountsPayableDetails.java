package com.code.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor@AllArgsConstructor
/***
 * 应付账款明细
 */
public class AccountsPayableDetails {
  /***
   * 供应商ID
   */
  private long expenditureNum;
  /****
   * 单据日期
   */
  private java.sql.Timestamp invoicesDate;
  /***
   * 单据编号
   */
  private String invoicesNum;
  /***
   * 增加应付款
   */
  private double increaseDue;
  /***
   * 增加预付款
   */
  private double advancePaymentIncrease;
  /***
   * 应付款余额
   */
  private double balancePayable;
  /***
   * 余额
   */
  private String remark;


  public long getExpenditureNum() {
    return expenditureNum;
  }

  public void setExpenditureNum(long expenditureNum) {
    this.expenditureNum = expenditureNum;
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
