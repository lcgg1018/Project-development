package com.code.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor@AllArgsConstructor
/***
 * 应收账款明细
 */
public class AccountReceivableDetail {

  /***
   * 客户ID
   */
  private long clienteleId;
  /***
   * 单据日期
   */
  private java.sql.Timestamp invoicesDate;
  /***
   * 单据编号
   */
  private String invoicesNum;
  /***
   *增加应付款
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
   * 备注
   */
  private String remark;

  public long getClienteleId() {
    return clienteleId;
  }

  public void setClienteleId(long clienteleId) {
    this.clienteleId = clienteleId;
  }

  public Timestamp getInvoicesDate() {
    return invoicesDate;
  }

  public void setInvoicesDate(Timestamp invoicesDate) {
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
