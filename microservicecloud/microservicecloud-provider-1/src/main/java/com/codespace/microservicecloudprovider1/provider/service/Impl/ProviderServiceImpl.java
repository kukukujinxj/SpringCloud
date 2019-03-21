package com.codespace.microservicecloudprovider1.provider.service.Impl;

import com.codespace.microservicecloudprovider1.provider.service.ProviderService;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/3/19
 * Time: 11:45
 */
@Service
public class ProviderServiceImpl implements ProviderService {

	@Override
	public Boolean test() {
		return true;
	}
}
