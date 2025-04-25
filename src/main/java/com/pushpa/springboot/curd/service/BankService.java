package com.pushpa.springboot.curd.service;

import com.pushpa.springboot.curd.entity.Bank;

import java.util.List;

public interface BankService {
    public double getTotalBalance();
    public String getAccountNumberName();
    public List<Bank> getOnlineBankList();
}
