package com.codeservice.microservicecloudconsumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MicroservicecloudConsumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConsumer1Application.class, args);
	}

}
