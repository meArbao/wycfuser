package com.zybaiyou.wycfuser.service;

import com.zybaiyou.wycfuser.pojo.Wy_goods_package;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public interface GoodsService {
    List<Wy_goods_package> GetRecommendGoodsPackage();
}
