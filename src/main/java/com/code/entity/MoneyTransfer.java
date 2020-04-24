package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 资金转账单
 */
@NoArgsConstructor@AllArgsConstructor
public class MoneyTransfer {
  /***
   * 转出账户
   */
  private long outAccountId;
  /***
   *转入账户
   */
  private long shiftToAccountId;
  /***
   *金额
   */
  private double money;
  /***
   *结算方式
   */
  private long clearingFormId;
  /***
   *结算号
   */
  private long settleNum;
  /***
   *备注
   */
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
