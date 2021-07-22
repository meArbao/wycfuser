package com.zybaiyou.wycfuser.mapper;

import com.zybaiyou.wycfuser.pojo.Wy_store_barnner;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Wy_store_barnnerMapper {

   List<Wy_store_barnner> getBanners(Integer sb_is_recommend_index);
}
