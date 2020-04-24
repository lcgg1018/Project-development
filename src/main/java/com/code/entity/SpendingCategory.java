package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 支出类别
 */
@NoArgsConstructor@AllArgsConstructor
public class SpendingCategory {
  /***
   * 支出类别ID
   */
  private long spendingcategoryId;
  /***
   * 类别名称
   */
  private String spending_CategoryName;


  public long getSpendingcategoryId() {
    return spendingcategoryId;
  }

  public void setSpendingcategoryId(long spendingcategoryId) {
    this.spendingcategoryId = spendingcategoryId;
  }


  public String getSpending_CategoryName() {
    return spending_CategoryName;
  }

  public void setSpending_CategoryName(String spending_CategoryName) {
    this.spending_CategoryName = spending_CategoryName;
  }

}
