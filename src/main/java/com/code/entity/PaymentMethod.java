package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 结算方式
 */
@NoArgsConstructor@AllArgsConstructor
public class PaymentMethod {
  /***
   *结算ID
   */
  private long clearingFormId;
  /***
   * 结算方式
   */
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
