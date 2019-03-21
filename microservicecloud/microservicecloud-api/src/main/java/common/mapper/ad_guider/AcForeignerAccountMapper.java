package common.mapper.ad_guider;

import common.pojo.ad_guider.AcForeignerAccount;

public interface AcForeignerAccountMapper {
    int deleteByPrimaryKey(Integer fAid);

    int insert(AcForeignerAccount record);

    int insertSelective(AcForeignerAccount record);

    AcForeignerAccount selectByPrimaryKey(Integer fAid);

    int updateByPrimaryKeySelective(AcForeignerAccount record);

    int updateByPrimaryKeyWithBLOBs(AcForeignerAccount record);

    int updateByPrimaryKey(AcForeignerAccount record);
}