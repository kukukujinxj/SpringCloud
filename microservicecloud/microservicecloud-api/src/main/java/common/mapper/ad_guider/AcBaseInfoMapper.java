package common.mapper.ad_guider;

import common.pojo.ad_guider.AcBaseInfo;

public interface AcBaseInfoMapper {
    int deleteByPrimaryKey(Integer ubInfoId);

    int insert(AcBaseInfo record);

    int insertSelective(AcBaseInfo record);

    AcBaseInfo selectByPrimaryKey(Integer ubInfoId);

    int updateByPrimaryKeySelective(AcBaseInfo record);

    int updateByPrimaryKey(AcBaseInfo record);
}