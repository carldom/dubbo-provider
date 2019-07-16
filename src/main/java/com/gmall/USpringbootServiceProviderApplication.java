package com.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@SpringBootApplication
@EnableDubbo
public class USpringbootServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(USpringbootServiceProviderApplication.class, args);
	}

}
