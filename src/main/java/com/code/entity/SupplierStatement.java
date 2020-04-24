package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 供应商对账
 */
@NoArgsConstructor@AllArgsConstructor
public class SupplierStatement {
  /***
   * 供应商ID
   */
  private String supplierId;
  /***
   *单据编号
   */
  private String invoicesNum;
  /***
   *单据日期
   */
  private java.sql.Timestamp invoicesDate;
  /***
   *业务类别
   */
  private String businessCategory;
  /***
   *采购金额
   */
  private double purchaseAmount;
  /***
   *优惠金额
   */
  private double discountAmount;
  /***
   *应收金额
   */
  private double amountReceivable;
  /***
   *实际收款金额
   */
  private double actualAmountReceived;
  /***
   *应收款余额
   */
  private double receivableBalance;
  /***
   *备注
   */
  private String remark;


  public String getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(String supplierId) {
    this.supplierId = supplierId;
  }


  public String getInvoicesNum() {
    return invoicesNum;
  }

  public void setInvoicesNum(String invoicesNum) {
    this.invoicesNum = invoicesNum;
  }


  public java.sql.Timestamp getInvoicesDate() {
    return invoicesDate;
  }

  public void setInvoicesDate(java.sql.Timestamp invoicesDate) {
    this.invoicesDate = invoicesDate;
  }


  public String getBusinessCategory() {
    return businessCategory;
  }

  public void setBusinessCategory(String businessCategory) {
    this.businessCategory = businessCategory;
  }


  public double getPurchaseAmount() {
    return purchaseAmount;
  }

  public void setPurchaseAmount(double purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
  }


  public double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(double discountAmount) {
    this.discountAmount = discountAmount;
  }


  public double getAmountReceivable() {
    return amountReceivable;
  }

  public void setAmountReceivable(double amountReceivable) {
    this.amountReceivable = amountReceivable;
  }


  public double getActualAmountReceived() {
    return actualAmountReceived;
  }

  public void setActualAmountReceived(double actualAmountReceived) {
    this.actualAmountReceived = actualAmountReceived;
  }


  public double getReceivableBalance() {
    return receivableBalance;
  }

  public void setReceivableBalance(double receivableBalance) {
    this.receivableBalance = receivableBalance;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
