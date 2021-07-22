package com.zybaiyou.wycfuser.mapper;

import com.zybaiyou.wycfuser.pojo.Wy_goods_package;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Wy_user_infoMapper {
    String GetRecommendGoodsPackage();

}
