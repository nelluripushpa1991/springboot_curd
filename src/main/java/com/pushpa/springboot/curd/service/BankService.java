package com.pushpa.springboot.curd.service;

import com.pushpa.springboot.curd.entity.Bank;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankService {
    public double getTotalBalance();
    public List<String> getAccountNumberName(boolean monthlyCharge);
    public List<Bank> getBankListBasedOnType(String type);
}
