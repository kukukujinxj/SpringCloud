package com.codeservice.microservicecloudconsumer1;

import com.ribbon.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-PROVIDER", configuration = MySelfRule.class)
public class MicroservicecloudConsumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConsumer1Application.class, args);
	}

}
