package com.code.entity;


public class OtherExpenses {

  private long expenditureNum;
  private String supplierId;
  private java.sql.Timestamp invoicesDate;
  private long spendingCategoryId;
  private double money;
  private String remark;


  public long getExpenditureNum() {
    return expenditureNum;
  }

  public void setExpenditureNum(long expenditureNum) {
    this.expenditureNum = expenditureNum;
  }


  public String getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(String supplierId) {
    this.supplierId = supplierId;
  }


  public java.sql.Timestamp getInvoicesDate() {
    return invoicesDate;
  }

  public void setInvoicesDate(java.sql.Timestamp invoicesDate) {
    this.invoicesDate = invoicesDate;
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


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
