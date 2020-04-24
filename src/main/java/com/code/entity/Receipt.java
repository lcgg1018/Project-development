package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 收款单
 */
@NoArgsConstructor@AllArgsConstructor
public class Receipt {
  /***
   *结算账户
   */
  private long settlementAccountId;
  /***
   *销货单位ID
   */
  private long unitSalesId;
  /***
   *收款人
   */
  private long payee;
  /***
   *收款金额
   */
  private double receivableAmount;
  /***
   *结算方式
   */
  private long clearingForm;
  /***
   *结算号
   */
  private long settleNum;
  /***
   *单据日期
   */
  private java.sql.Timestamp invoicesDate;
  /***
   *备注
   */
  private String remark;


  public long getSettlementAccountId() {
    return settlementAccountId;
  }

  public void setSettlementAccountId(long settlementAccountId) {
    this.settlementAccountId = settlementAccountId;
  }


  public long getUnitSalesId() {
    return unitSalesId;
  }

  public void setUnitSalesId(long unitSalesId) {
    this.unitSalesId = unitSalesId;
  }

  public long getPayee() {
    return payee;
  }

  public void setPayee(long payee) {
    this.payee = payee;
  }

  public double getReceivableAmount() {
    return receivableAmount;
  }

  public void setReceivableAmount(double receivableAmount) {
    this.receivableAmount = receivableAmount;
  }


  public long getClearingForm() {
    return clearingForm;
  }

  public void setClearingForm(long clearingForm) {
    this.clearingForm = clearingForm;
  }


  public long getSettleNum() {
    return settleNum;
  }

  public void setSettleNum(long settleNum) {
    this.settleNum = settleNum;
  }


  public java.sql.Timestamp getInvoicesDate() {
    return invoicesDate;
  }

  public void setInvoicesDate(java.sql.Timestamp invoicesDate) {
    this.invoicesDate = invoicesDate;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
