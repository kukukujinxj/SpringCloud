package common.mapper.ad_guider;

import common.pojo.ad_guider.AcForeignerAccountType;

public interface AcForeignerAccountTypeMapper {
    int deleteByPrimaryKey(Integer fAccountId);

    int insert(AcForeignerAccountType record);

    int insertSelective(AcForeignerAccountType record);

    AcForeignerAccountType selectByPrimaryKey(Integer fAccountId);

    int updateByPrimaryKeySelective(AcForeignerAccountType record);

    int updateByPrimaryKey(AcForeignerAccountType record);
}