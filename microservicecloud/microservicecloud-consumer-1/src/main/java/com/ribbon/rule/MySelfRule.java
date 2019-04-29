package com.ribbon.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/4/29
 * Time: 14:26
 */
@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {
		return new RetryRule();//Ribbon策略
	}
}
