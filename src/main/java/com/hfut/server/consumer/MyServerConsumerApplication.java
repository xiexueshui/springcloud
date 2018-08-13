package com.hfut.server.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@Slf4j
public class MyServerConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyServerConsumerApplication.class, args);
		log.info("Consumer服务启动!");
	}
}
