package com.code.entity;


public class PayAccount {

  private long accountId;
  private String payType;
  private String remittancesAccount;


  public long getAccountId() {
    return accountId;
  }

  public void setAccountId(long accountId) {
    this.accountId = accountId;
  }


  public String getPayType() {
    return payType;
  }

  public void setPayType(String payType) {
    this.payType = payType;
  }


  public String getRemittancesAccount() {
    return remittancesAccount;
  }

  public void setRemittancesAccount(String remittancesAccount) {
    this.remittancesAccount = remittancesAccount;
  }

}
