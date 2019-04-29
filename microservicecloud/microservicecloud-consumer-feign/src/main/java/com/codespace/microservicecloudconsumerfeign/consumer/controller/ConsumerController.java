package com.codespace.microservicecloudconsumerfeign.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/3/19
 * Time: 13:30
 */
@RestController
@RequestMapping(name = "服务消费者", value = "/sv1/consumer")
public class ConsumerController {

//	private static final String REST_URL_PREFIX = "http://localhost:8001";
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-PROVIDER";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(name = "获取账户信息", value = "/discovery")
	public Object discovery() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/sv1/provider/discovery", Object.class);
	}
}
