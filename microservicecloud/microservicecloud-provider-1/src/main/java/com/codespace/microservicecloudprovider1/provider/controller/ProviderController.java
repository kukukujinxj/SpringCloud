package com.codespace.microservicecloudprovider1.provider.controller;

import com.codespace.microservicecloudprovider1.provider.service.ProviderService;
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
	public Object discovery() {
		return providerServiceImpl.discovery();
	}
}
