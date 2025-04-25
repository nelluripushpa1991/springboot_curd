package com.pushpa.springboot.curd.service.impl;

import com.pushpa.springboot.curd.entity.Bank;
import com.pushpa.springboot.curd.service.BankService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankServiceImpl implements BankService {

    @Override
    public double getTotalBalance() {
        List<Bank> bankList = readDataFromJson();

        return 0;
    }

    @Override
    public String getAccountNumberName() {
        return null;
    }

    @Override
    public List<Bank> getOnlineBankList() {
        return null;
    }

    public List<Bank> readDataFromJson() {
        List<Bank> bankList = new ArrayList<>();
        List<String> types = new ArrayList<>();
        types.add("online");
        types.add("offline");
        bankList.add(new Bank(1111111, "Chase", types, 5000.00, true ));
        types.removeAll(types);
        types.add("online");
        bankList.add(new Bank(2222222, "Amex", types, 25000.00, false ));
        types.removeAll(types);
        types.add("online");
        types.add("offline");
        bankList.add(new Bank(3333333, "City", types, 10000.00, true ));
        return bankList;
    }
}
