package com.example.practice.jdk.stream;

import java.math.BigDecimal;

public class Account {
    private int accountNo;
    private String accountName;
    private BigDecimal amount;

    public Account(int accountNo, String accountName, BigDecimal amount) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.amount = amount;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", accountName='" + accountName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
