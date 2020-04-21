package com.code.entity;


public class Receipt {

  private long settlementAccountId;
  private long unitSalesId;
  private long __Payee;
  private double receivableAmount;
  private long clearingForm;
  private long settleNum;
  private java.sql.Timestamp invoicesDate;
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


  public long get__Payee() {
    return __Payee;
  }

  public void set__Payee(long __Payee) {
    this.__Payee = __Payee;
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
