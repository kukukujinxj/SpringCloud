package common.mapper.ad_guider;

import common.pojo.ad_guider.PrAccountGroupMember;

public interface PrAccountGroupMemberMapper {
    int deleteByPrimaryKey(Integer agmId);

    int insert(PrAccountGroupMember record);

    int insertSelective(PrAccountGroupMember record);

    PrAccountGroupMember selectByPrimaryKey(Integer agmId);

    int updateByPrimaryKeySelective(PrAccountGroupMember record);

    int updateByPrimaryKey(PrAccountGroupMember record);
}