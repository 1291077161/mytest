package com.yomahub.liteflow.bean.mapstruttest;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Joy
 * @date 2024/2/28
 * @param 
 * 
 */

@Mapper
public interface IPersonMapper {
    IPersonMapper INSTANCT = Mappers.getMapper(IPersonMapper.class);
    UserEntity po2entity(UserPo userPo);
}

