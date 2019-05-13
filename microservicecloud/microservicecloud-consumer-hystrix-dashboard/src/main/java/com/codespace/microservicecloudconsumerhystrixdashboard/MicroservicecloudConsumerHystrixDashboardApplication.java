package com.codespace.microservicecloudconsumerhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableHystrixDashboard
public class MicroservicecloudConsumerHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConsumerHystrixDashboardApplication.class, args);
	}

}