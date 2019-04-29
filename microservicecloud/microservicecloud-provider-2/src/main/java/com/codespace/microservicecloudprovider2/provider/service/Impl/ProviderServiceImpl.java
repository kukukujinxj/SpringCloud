package com.codespace.microservicecloudprovider2.provider.service.Impl;

import com.codespace.microservicecloudprovider2.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/3/19
 * Time: 11:45
 */
@Service
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	private DiscoveryClient client;

	@Override
	public Object discovery() {
		List<String> services = client.getServices();
		System.out.println("services ================= >" + services);

		List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-PROVIDER-1");
		for (ServiceInstance item : instances) {
			System.out.println(item.getInstanceId() + "\t" + item.getHost() + "\t" + item.getPort() + "\t" + item.getUri());
		}
		return this.client;
	}
}
