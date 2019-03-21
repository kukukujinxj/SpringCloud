package common.mapper.ad_guider;

import common.pojo.ad_guider.PrGroupFuncRelation;

public interface PrGroupFuncRelationMapper {
    int deleteByPrimaryKey(Integer pfrId);

    int insert(PrGroupFuncRelation record);

    int insertSelective(PrGroupFuncRelation record);

    PrGroupFuncRelation selectByPrimaryKey(Integer pfrId);

    int updateByPrimaryKeySelective(PrGroupFuncRelation record);

    int updateByPrimaryKey(PrGroupFuncRelation record);
}