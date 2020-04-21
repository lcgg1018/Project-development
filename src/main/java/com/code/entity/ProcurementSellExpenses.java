package com.code.entity;


public class ProcurementSellExpenses {

  private long supplierId;
  private long spendingCategoryId;
  private double money;
  private String unpaid;
  private String sourceListNum;
  private long expenditureNum;
  private String payment;
  private long paymentStatus;


  public long getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(long supplierId) {
    this.supplierId = supplierId;
  }


  public long getSpendingCategoryId() {
    return spendingCategoryId;
  }

  public void setSpendingCategoryId(long spendingCategoryId) {
    this.spendingCategoryId = spendingCategoryId;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public String getUnpaid() {
    return unpaid;
  }

  public void setUnpaid(String unpaid) {
    this.unpaid = unpaid;
  }


  public String getSourceListNum() {
    return sourceListNum;
  }

  public void setSourceListNum(String sourceListNum) {
    this.sourceListNum = sourceListNum;
  }


  public long getExpenditureNum() {
    return expenditureNum;
  }

  public void setExpenditureNum(long expenditureNum) {
    this.expenditureNum = expenditureNum;
  }


  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }


  public long getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(long paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

}
