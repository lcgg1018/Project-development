package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 其他收支明细
 */
@NoArgsConstructor
@AllArgsConstructor
public class OtherIncomeAndExpenditureDetails {
    /***
     *日期
     */
    private java.sql.Timestamp date;
    /***
     *单据编号
     */
    private String invoicesNum;
    /***
     *收支类别
     */
    private long incomeCategory;
    /***
     *收支项目
     */
    private String balanceOfProject;
    /***
     *收入
     */
    private double income;
    /***
     *支出
     */
    private double disburse;
    /***
     *客户ID/供应商ID
     */
    private String dealings;
    /***
     *备注
     */
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
