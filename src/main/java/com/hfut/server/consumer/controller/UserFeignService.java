package com.hfut.server.consumer.controller;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hfut.domain.User;

@FeignClient(value="ZUUL-PROVIDE",fallback=UserFeignServiceFallback.class)
public interface UserFeignService {
	@RequestMapping("/server-api/user/insert")
	public int insert(@RequestBody User user);
	@RequestMapping("/server-api/user/update")
	public int update(@RequestBody User user);
	@RequestMapping("/server-api/user/delete")
	public int delete(@RequestBody User user);
	@RequestMapping("/server-api/user/select")
	public List<User> select(@RequestBody User user);

}
