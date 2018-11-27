package com.gaoxi.gaoxitest1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties(prefix = "com.atguigu")
@EnableConfigurationProperties(ConfigBeanTest.class)
public class ConfigBeanTest {

    private Integer val1;

    private String val2;

    public Integer getVal1() {
        return val1;
    }

    public void setVal1(Integer val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }
}
