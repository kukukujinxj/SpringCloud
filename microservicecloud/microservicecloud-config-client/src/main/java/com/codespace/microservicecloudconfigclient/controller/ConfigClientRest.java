package com.codespace.microservicecloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/5/13
 * Time: 14:14
 */
@RestController
public class ConfigClientRest {

	@Value("${spring.application.name}")
	private String applicationName;

	@Value("${eureka.client.service-url.defaultZone}")
	private String eurekaServers;

	@Value("${server.port}")
	private String port;

	public String getConfig() {
		return "";
	}
}
