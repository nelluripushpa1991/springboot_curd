package com.pushpa.springboot.curd.controller;

import com.pushpa.springboot.curd.service.impl.SelfDividingNumberCheckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SelfDividingNumberCheckerController {

    @Autowired
    public SelfDividingNumberCheckerService selfDividingNumberCheckerService;

    @GetMapping("/{num}")
    public boolean checkSelfDividingNumber(@PathVariable("num") int num) {
        return selfDividingNumberCheckerService.checkSelfDividingNumber(num);
    }

}
