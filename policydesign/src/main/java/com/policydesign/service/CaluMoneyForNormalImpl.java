package com.policydesign.service;

import org.springframework.stereotype.Service;

/**
 * Created by zyq on 2021/3/8.
 */
@Service
public class CaluMoneyForNormalImpl implements CaluMoneyByTypeService {

    @Override
    public String type() {
        return "normal";
    }

    @Override
    public int money(int money) {
        return money*10;
    }
}
