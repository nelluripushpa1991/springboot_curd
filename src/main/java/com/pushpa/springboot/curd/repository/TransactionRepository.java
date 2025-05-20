package com.pushpa.springboot.curd.repository;

import com.pushpa.springboot.curd.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    List<Transaction> findByType(String type);
}
