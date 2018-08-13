package com.hfut.server.consumer.controller;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hfut.domain.User;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class UserFeignServiceFallback implements UserFeignService{

	@Override
	public int insert(User user) {
		log.info("Feign熔断了!");
		return -1;
	}

	@Override
	public int update(User user) {
		log.info("Feign熔断了!");
		return -1;
	}

	@Override
	public int delete(User user) {
		log.info("Feign熔断了!");
		return -1;
	}

	@Override
	public List<User> select(User user) {
		log.info("Feign熔断了!");
		return null;
	}

}
