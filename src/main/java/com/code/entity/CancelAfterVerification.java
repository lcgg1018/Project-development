package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 核销单
 */
@NoArgsConstructor@AllArgsConstructor
public class CancelAfterVerification {
  /***
   *源单编号
   */
  private String sourceListNum;
  /***
   *业务类别
   */
  private String professionalType;
  /***
   *单据日期
   */
  private java.sql.Timestamp invoicesDate;
  /***
   *已核销金额
   */
  private double confirmedMoney;
  /***
   *未核销金额
   */
  private double unfinishedMoney;
  /***
   *客户ID
   */
  private long clienteleId;
  /***
   *转出客户
   */
  private String out_consumer;
  /***
   * 转入客户
   */
  private String income_consumer_id;

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

  public String getOut_consumer() {
    return out_consumer;
  }

  public void setOut_consumer(String out_consumer) {
    this.out_consumer = out_consumer;
  }

  public String getIncome_consumer_id() {
    return income_consumer_id;
  }

  public void setIncome_consumer_id(String income_consumer_id) {
    this.income_consumer_id = income_consumer_id;
  }
}
