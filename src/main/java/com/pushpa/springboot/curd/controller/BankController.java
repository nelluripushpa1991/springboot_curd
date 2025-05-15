package com.pushpa.springboot.curd.controller;

import com.pushpa.springboot.curd.entity.Bank;
import com.pushpa.springboot.curd.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping
    public ResponseEntity<List<Bank>> getBankListBasedOnType(@RequestParam("type") String type) {
        return new ResponseEntity<>(bankService.getBankListBasedOnType(type), HttpStatus.OK);
    }

    @GetMapping("/totalBalance")
    public double getTotalBalance() {
        return bankService.getTotalBalance();
    }

    @GetMapping("/{monthlyCharge}")
    public List<String> getAccountNumberName(@PathVariable("monthlyCharge") boolean monthlyCharge) {
        return bankService.getAccountNumberName(monthlyCharge);
    }



}
