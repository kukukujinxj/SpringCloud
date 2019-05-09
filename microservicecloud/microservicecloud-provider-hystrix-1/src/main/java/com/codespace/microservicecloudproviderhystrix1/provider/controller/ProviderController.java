package com.codespace.microservicecloudproviderhystrix1.provider.controller;

import com.codespace.microservicecloudproviderhystrix1.provider.service.ProviderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/3/19
 * Time: 11:45
 */
@RestController
@RequestMapping(name = "服务提供者", value = "/sv1/provider")
public class ProviderController {

	@Autowired
	private ProviderService providerServiceImpl;

	@RequestMapping(name = "获取注册中心服务列表", value = "/discovery")
	//一旦服务调用失败并抛出异常后，自动调用@HystrixCommand标注好的fallbackMethod调用类的指定方法
	@HystrixCommand(fallbackMethod = "processHystrix")
	public Object discovery(Integer flag) {
		return providerServiceImpl.discovery(flag);
	}

	public String processHystrix(Integer flag) {
		return "hystrix服务熔断";
	}
}
