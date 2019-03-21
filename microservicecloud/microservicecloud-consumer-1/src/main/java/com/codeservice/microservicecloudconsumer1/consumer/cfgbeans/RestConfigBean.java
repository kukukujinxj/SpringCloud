package com.codeservice.microservicecloudconsumer1.consumer.cfgbeans;

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
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
