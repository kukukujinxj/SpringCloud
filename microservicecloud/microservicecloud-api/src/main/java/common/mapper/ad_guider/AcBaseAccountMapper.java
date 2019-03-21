package common.mapper.ad_guider;

import common.pojo.ad_guider.AcBaseAccount;

public interface AcBaseAccountMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(AcBaseAccount record);

    int insertSelective(AcBaseAccount record);

    AcBaseAccount selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(AcBaseAccount record);

    int updateByPrimaryKey(AcBaseAccount record);
}