package com.zybaiyou.wycfuser.mapper;

import com.zybaiyou.wycfuser.pojo.Wy_VipCardInfo;
import com.zybaiyou.wycfuser.pojo.Wy_test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Mapper
@Repository
public interface Wy_VipCardInfoMapper {
    List<List<?>> GetVipCardInfo(@Param("uid")long uid);
}
