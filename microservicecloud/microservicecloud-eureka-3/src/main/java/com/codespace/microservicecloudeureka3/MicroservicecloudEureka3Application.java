package com.codespace.microservicecloudeureka3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaServer
public class MicroservicecloudEureka3Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudEureka3Application.class, args);
	}

}
