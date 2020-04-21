package com.code.entity;


public class PaymentMethod {

  private long clearingFormId;
  private String clearingForm;


  public long getClearingFormId() {
    return clearingFormId;
  }

  public void setClearingFormId(long clearingFormId) {
    this.clearingFormId = clearingFormId;
  }


  public String getClearingForm() {
    return clearingForm;
  }

  public void setClearingForm(String clearingForm) {
    this.clearingForm = clearingForm;
  }

}
