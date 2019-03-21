package com.codeservice.microservicecloudconsumer1.consumer.controller;

import common.pojo.common_account.AcBaseAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/3/19
 * Time: 13:30
 */
@RestController
@RequestMapping(name = "服务消费者", value = "/sv1/consumer")
public class ConsumerController {

	private static final String REST_URL_PREFIX = "http://localhost:8001";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(name = "获取账户信息", value = "/getAccount")
	public List<AcBaseAccount> getAccount() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/sv1/provider/getAccount", List.class);
	}
}
