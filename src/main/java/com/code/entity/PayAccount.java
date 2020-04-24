package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 财产账户表
 */
@NoArgsConstructor
@AllArgsConstructor
public class PayAccount {
    /***
     *账户ID
     */
    private long accountId;
    /***
     *汇款类型
     */
    private String payType;
    /***
     *汇款账号
     */
    private String remittancesAccount;

    /***
     *
     */


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
