package com.codespace.microservicecloudproviderhystrix1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker//对hystrix熔断机制的支持
public class MicroservicecloudProviderHystrix1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudProviderHystrix1Application.class, args);
	}

}
