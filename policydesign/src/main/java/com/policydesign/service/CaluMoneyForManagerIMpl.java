package com.policydesign.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by zyq on 2021/3/8.
 */
@Service
@Primary
public class CaluMoneyForManagerImpl implements CaluMoneyByTypeService {
    @Override
    public String type() {
        return "manager";
    }

    @Override
    public int money(int money) {
        return money * 100;
    }
}
