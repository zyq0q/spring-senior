package com.policydesign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zyq on 2021/3/8.
 */
@Service
public class PolicyDesignService {

    @Autowired
    PolicyDesignService policyDesignService;

    @Autowired
    CaluMoneyByTypeService caluMoneyByTypeService;

    @Autowired
    ApplicationContext applicationContext;

    Map<String, CaluMoneyByTypeService> map = new HashMap<>();

    /**
     * 将service放入map
     * @param services
     */
    public PolicyDesignService(List<CaluMoneyByTypeService> services){
        for(CaluMoneyByTypeService service : services){
            map.put(service.type(), service);
        }
    }

    //以计算年终奖为例, type为员工级别，money为奖金基数
    public Object CaluMoney(String type, int money){
       /* if(type.equals("normal")){

        }else if(type.equals("manage")){

        }
        return null;*/
        //以下为spring策略模式的简单demo, 即在各自的实现类中实现各自的逻辑
        return map.get(type).money(money);

    }
}
