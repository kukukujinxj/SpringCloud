package com.codespace.microservicecloudconsumerfeign.consumer.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/3/19
 * Time: 13:21
 */
@Configuration
public class RestConfigBean {

	@Bean
	@LoadBalanced //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端负载均衡的工具
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public IRule myRule() {
//		return new RoundRobinRule();//Ribbon轮询策略
//		return new RandomRule();//Ribbon随机策略
		return new RetryRule();//先按照轮询策略获取服务，若获取服务失败，则在指定时间内进行重试，获取可用的服务
	}
}
