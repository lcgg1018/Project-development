package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 其他收入单
 */
@NoArgsConstructor
@AllArgsConstructor
public class OtherRevenue {
    /***
     *支入编号
     */
    private long expenditureNum;
    /***
     *供应商ID
     */
    private String supplierId;
    /***
     *单据日期
     */
    private java.sql.Timestamp invoicesDate;
    /***
     *支持类别
     */
    private long spendingCategoryId;
    /***
     *金额
     */
    private double money;
    /***
     *备注
     */
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
