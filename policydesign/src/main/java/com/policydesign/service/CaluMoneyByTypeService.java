package com.policydesign.service;

import org.springframework.stereotype.Service;

/**
 * Created by zyq on 2021/3/8.
 */
//根据员工级别计算年终奖
public interface CaluMoneyByTypeService {

    public String type();

    public int money(int money);
}
