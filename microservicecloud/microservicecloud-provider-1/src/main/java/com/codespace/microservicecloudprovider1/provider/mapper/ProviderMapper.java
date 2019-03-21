package com.codespace.microservicecloudprovider1.provider.mapper;

import common.pojo.common_account.AcBaseAccount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jxj
 * Date: 2019/3/19
 * Time: 11:35
 */
@Mapper
@Repository
public interface ProviderMapper {
	List<AcBaseAccount> selectAccount();
}
