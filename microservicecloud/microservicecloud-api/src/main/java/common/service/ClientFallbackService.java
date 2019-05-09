package common.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/5/9
 * Time: 16:17
 */
@Component //必须添加该注解
public class ClientFallbackService implements FallbackFactory<FeignClientService> {
	@Override
	public FeignClientService create(Throwable cause) {
		return new FeignClientService() {
			@Override
			public Object discovery(Integer flag) {
				return "hystrix服务降级";
			}
		};
	}
}
