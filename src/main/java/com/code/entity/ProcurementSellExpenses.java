package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 采购销售费用清单
 */
@NoArgsConstructor
@AllArgsConstructor
public class ProcurementSellExpenses {
    /***
     *供应商ID
     */
    private long supplierId;
    /***
     *支出类别
     */
    private long spendingCategoryId;
    /***
     *金额
     */
    private double money;
    /***
     *未付费用
     */
    private String unpaid;
    /***
     *源单号
     */
    private String sourceListNum;
    /***
     *其他支出单编号
     */
    private long expenditureNum;
    /***
     *付款
     */
    private String payment;
    /***
     *付款状态
     */
    private long paymentStatus;


    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
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


    public String getUnpaid() {
        return unpaid;
    }

    public void setUnpaid(String unpaid) {
        this.unpaid = unpaid;
    }


    public String getSourceListNum() {
        return sourceListNum;
    }

    public void setSourceListNum(String sourceListNum) {
        this.sourceListNum = sourceListNum;
    }


    public long getExpenditureNum() {
        return expenditureNum;
    }

    public void setExpenditureNum(long expenditureNum) {
        this.expenditureNum = expenditureNum;
    }


    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }


    public long getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(long paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

}
