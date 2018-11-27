package com.gaoxi.gaoxitest1;

import com.gaoxi.gaoxitest1.config.ConfigBeanTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class GaoxiTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(GaoxiTest1Application.class, args);
	}
}
