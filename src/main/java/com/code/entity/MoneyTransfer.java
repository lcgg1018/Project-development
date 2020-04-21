package com.code.entity;


public class MoneyTransfer {

  private long outAccountId;
  private long shiftToAccountId;
  private double money;
  private long clearingFormId;
  private long settleNum;
  private String remark;


  public long getOutAccountId() {
    return outAccountId;
  }

  public void setOutAccountId(long outAccountId) {
    this.outAccountId = outAccountId;
  }


  public long getShiftToAccountId() {
    return shiftToAccountId;
  }

  public void setShiftToAccountId(long shiftToAccountId) {
    this.shiftToAccountId = shiftToAccountId;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public long getClearingFormId() {
    return clearingFormId;
  }

  public void setClearingFormId(long clearingFormId) {
    this.clearingFormId = clearingFormId;
  }


  public long getSettleNum() {
    return settleNum;
  }

  public void setSettleNum(long settleNum) {
    this.settleNum = settleNum;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
