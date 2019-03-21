package common.mapper.ad_guider;

import common.pojo.ad_guider.PrAccountGroup;

public interface PrAccountGroupMapper {
    int deleteByPrimaryKey(Integer agId);

    int insert(PrAccountGroup record);

    int insertSelective(PrAccountGroup record);

    PrAccountGroup selectByPrimaryKey(Integer agId);

    int updateByPrimaryKeySelective(PrAccountGroup record);

    int updateByPrimaryKey(PrAccountGroup record);
}