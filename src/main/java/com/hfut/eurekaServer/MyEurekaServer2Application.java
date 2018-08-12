package com.hfut.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class MyEurekaServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyEurekaServer2Application.class, args);
		log.info("Eureka 注册中心2000 启动");
	}
}
