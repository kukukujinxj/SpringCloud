package com.codespace.microservicecloudconsumerfeign.consumer.controller;

import common.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/3/19
 * Time: 13:30
 */
@RestController
@RequestMapping(name = "服务消费者", value = "/sv1/consumer/feign")
public class ConsumerController {

	@Autowired
	private FeignClientService feignClientService;

	@RequestMapping(name = "获取账户信息", value = "/discovery")
	Object discovery(Integer flag) {
		return feignClientService.discovery(flag);
	}
}
