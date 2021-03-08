package com.aopdemo.controller;

import com.aopdemo.annotation.MethodProceedTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zyq on 2021/3/7.
 */
@RestController
@RequestMapping("/aopdemo")
public class AopDemoController {

    /**
     * 方法执行时长
     * @return
     */
    @RequestMapping("/test1")
    @MethodProceedTime()
    public Object test1(){
     return "test1";
    }

}
