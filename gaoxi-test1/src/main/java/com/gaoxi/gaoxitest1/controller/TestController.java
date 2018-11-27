package com.gaoxi.gaoxitest1.controller;

import com.gaoxi.gaoxitest1.config.ConfigBeanTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ConfigBeanTest configBeanTest;

    @Value("${com.atguigu.val1}")
    private Integer aa;

    @Value("${com.atguigu.val2}")
    private String bb;
    @RequestMapping(value = "test1")
    public String testContrlooer(){
        return aa+"  "+bb;
    }
    @RequestMapping(value = "test2")
    public String test2(){

        return configBeanTest.getVal2()+configBeanTest.getVal1();
    }
}
