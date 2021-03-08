package com.policydesign.controller;

import com.policydesign.service.PolicyDesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zyq on 2021/3/8.
 */
@RestController
@RequestMapping("/policyDesign")
public class PolicyDesignController {

    @Autowired
    PolicyDesignService policyDesignService;

    @RequestMapping("/test1")
    public Object test1(String type, int money){

        return policyDesignService.CaluMoney(type,money);
    }

}
