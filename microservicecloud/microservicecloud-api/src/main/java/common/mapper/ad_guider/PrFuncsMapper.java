package common.mapper.ad_guider;

import common.pojo.ad_guider.PrFuncs;

public interface PrFuncsMapper {
    int deleteByPrimaryKey(Integer funcId);

    int insert(PrFuncs record);

    int insertSelective(PrFuncs record);

    PrFuncs selectByPrimaryKey(Integer funcId);

    int updateByPrimaryKeySelective(PrFuncs record);

    int updateByPrimaryKeyWithBLOBs(PrFuncs record);

    int updateByPrimaryKey(PrFuncs record);
}