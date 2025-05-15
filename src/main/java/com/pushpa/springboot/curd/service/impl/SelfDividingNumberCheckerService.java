package com.pushpa.springboot.curd.service.impl;

import org.springframework.stereotype.Service;

@Service
public class SelfDividingNumberCheckerService {
    public boolean checkSelfDividingNumber(int num) {
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || original % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
