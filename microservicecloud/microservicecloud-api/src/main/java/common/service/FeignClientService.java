package common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/4/29
 * Time: 16:23
 */
//@FeignClient(value = "MICROSERVICECLOUD-PROVIDER")
@FeignClient(value = "MICROSERVICECLOUD-PROVIDER", fallback = ClientFallbackService.class)
public interface FeignClientService {

	@RequestMapping(name = "获取账户信息", value = "/sv1/provider/discovery")
	Object discovery(Integer flag);
}
