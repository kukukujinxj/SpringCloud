package common.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/4/29
 * Time: 16:23
 */
@FeignClient(value = "MICROSERVICECLOUD-PROVIDER")
public interface FeignClientService {
	Object discovery();
}
