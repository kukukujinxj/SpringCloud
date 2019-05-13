package com.codespace.microservicecloudconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,
		scanBasePackages = {"com.codespace.microservicecloudconsumerfeign", "common.service"})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"common.service"})
public class MicroservicecloudConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConsumerFeignApplication.class, args);
	}

}
