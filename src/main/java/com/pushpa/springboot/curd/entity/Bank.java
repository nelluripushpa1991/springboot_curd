package com.pushpa.springboot.curd.entity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Bank {
    private long accountNumber;
    private String name;
    private List<String> type;
    private double balance;
    private boolean isMonthlyCharge;

    public Bank() {}

    public Bank(long accountNumber, String name, List<String> type, double balance, boolean isMonthlyCharge) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.isMonthlyCharge = isMonthlyCharge;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isMonthlyCharge() {
        return isMonthlyCharge;
    }

    public void setMonthlyCharge(boolean monthlyCharge) {
        isMonthlyCharge = monthlyCharge;
    }
    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", balance=" + balance +
                ", isMonthlyCharge=" + isMonthlyCharge +
                '}';
    }
}
