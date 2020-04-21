package com.code.entity;


public class OtherIncomeAndExpenditureDetails {

  private java.sql.Timestamp date;
  private String invoicesNum;
  private long incomeCategory;
  private String balanceOfProject;
  private double income;
  private double disburse;
  private String dealings;
  private String remark;


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


  public long getIncomeCategory() {
    return incomeCategory;
  }

  public void setIncomeCategory(long incomeCategory) {
    this.incomeCategory = incomeCategory;
  }


  public String getBalanceOfProject() {
    return balanceOfProject;
  }

  public void setBalanceOfProject(String balanceOfProject) {
    this.balanceOfProject = balanceOfProject;
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


  public String getDealings() {
    return dealings;
  }

  public void setDealings(String dealings) {
    this.dealings = dealings;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
