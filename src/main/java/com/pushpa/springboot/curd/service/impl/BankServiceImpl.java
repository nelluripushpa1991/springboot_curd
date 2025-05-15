package com.pushpa.springboot.curd.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pushpa.springboot.curd.entity.Bank;
import com.pushpa.springboot.curd.service.BankService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    public static List<Bank> bankList = readDataFromJson();

    @Override
    public double getTotalBalance() {
        return bankList.stream().mapToDouble(Bank::getBalance).sum();
    }

    @Override
    public List<String> getAccountNumberName(boolean monthlyCharge) {
        List<Bank> list = bankList.stream().filter(Bank::isMonthlyCharge).toList();
        return list.stream().map(bank -> bank.getAccountNumber()+"-"+bank.getName()).toList();
    }

    @Override
    public List<Bank> getBankListBasedOnType(String type) {
        return bankList.stream().filter(bank -> bank.getType().contains(type)).toList();
    }

    public static List<Bank> readDataFromJson() {
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

//    public static List<Bank> readDataFromJonFile() {
//        List<Bank> bankList = new ArrayList<>();
//        ObjectMapper mapper = new ObjectMapper();
//        File jsonPath = new File("C:/Users/naren/OneDrive/Desktop/Pushpa/SpringBoot/banks.json");
//        try {
//            bankList  = mapper.readValue(jsonPath,new TypeReference<List<Bank>>(){});
//        } catch (IOException e) {
//            System.out.println("Exception occurs while reading json file : "+e.getMessage());
//            throw new RuntimeException(e);
//        }
//        return bankList;
//    }
}
