package com.code.entity;


public class CancelAfterVerification {

  private String sourceListNum;
  private String professionalType;
  private java.sql.Timestamp invoicesDate;
  private double confirmedMoney;
  private double unfinishedMoney;
  private long clienteleId;


  public String getSourceListNum() {
    return sourceListNum;
  }

  public void setSourceListNum(String sourceListNum) {
    this.sourceListNum = sourceListNum;
  }


  public String getProfessionalType() {
    return professionalType;
  }

  public void setProfessionalType(String professionalType) {
    this.professionalType = professionalType;
  }


  public java.sql.Timestamp getInvoicesDate() {
    return invoicesDate;
  }

  public void setInvoicesDate(java.sql.Timestamp invoicesDate) {
    this.invoicesDate = invoicesDate;
  }


  public double getConfirmedMoney() {
    return confirmedMoney;
  }

  public void setConfirmedMoney(double confirmedMoney) {
    this.confirmedMoney = confirmedMoney;
  }


  public double getUnfinishedMoney() {
    return unfinishedMoney;
  }

  public void setUnfinishedMoney(double unfinishedMoney) {
    this.unfinishedMoney = unfinishedMoney;
  }


  public long getClienteleId() {
    return clienteleId;
  }

  public void setClienteleId(long clienteleId) {
    this.clienteleId = clienteleId;
  }

}
