package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 客户对账单
 */
@NoArgsConstructor@AllArgsConstructor
public class CustomerStatement {

  /***
   *客户ID
   */
  private long clienteleId;
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
   *源销货订单号
   */
  private String sourceListNum;
  /***
   *销售金额
   */
  private double salesAmount;
  /***
   *优惠金额
   */
  private double discountAmount;
  /***
   *客户承担费用
   */
  private double payThePiper;
  /***
   *应收金额
   */
  private double amountReceivable;
  /***
   *实际收款金额
   */
  private double actualAmountReceived;
  /***
   *应收款金额
   */
  private double receivableBalance;
  /***
   *备注
   */
  private String remark;


  public long getClienteleId() {
    return clienteleId;
  }

  public void setClienteleId(long clienteleId) {
    this.clienteleId = clienteleId;
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


  public String getSourceListNum() {
    return sourceListNum;
  }

  public void setSourceListNum(String sourceListNum) {
    this.sourceListNum = sourceListNum;
  }


  public double getSalesAmount() {
    return salesAmount;
  }

  public void setSalesAmount(double salesAmount) {
    this.salesAmount = salesAmount;
  }


  public double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(double discountAmount) {
    this.discountAmount = discountAmount;
  }


  public double getPayThePiper() {
    return payThePiper;
  }

  public void setPayThePiper(double payThePiper) {
    this.payThePiper = payThePiper;
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
