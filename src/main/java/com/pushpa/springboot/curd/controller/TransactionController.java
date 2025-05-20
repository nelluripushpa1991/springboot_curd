package com.pushpa.springboot.curd.controller;

import com.pushpa.springboot.curd.entity.Transaction;
import com.pushpa.springboot.curd.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/transaction")
@CrossOrigin(origins = "http://localhost:4200")
public class TransactionController {

    @Autowired
    private TransactionRepository repository;

    @GetMapping
    public List<Transaction> getAll(@RequestParam(required = false) String type) {
        return (type == null) ? repository.findAll() : repository.findByType(type);
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        transaction.setTimeStamp(LocalDateTime.now());
        return repository.save(transaction);
    }

}
