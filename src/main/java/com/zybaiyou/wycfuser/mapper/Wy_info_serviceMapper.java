package com.zybaiyou.wycfuser.mapper;

import com.zybaiyou.wycfuser.pojo.Wy_info_service;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Wy_info_serviceMapper {

    Wy_info_service getInfoServiceById(@Param("fieldkeylist")String fieldkeylist,@Param("ser_id")Integer ser_id);

    int addInfoServiceViewNum(@Param("ser_id")Integer ser_id);

    List<Wy_info_service> FindInfoServices(@Param("limitnum")Integer limitnum);
}
