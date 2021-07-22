package com.zybaiyou.wycfuser.service.impl;

import com.zybaiyou.wycfuser.mapper.Wy_goods_packageMapper;
import com.zybaiyou.wycfuser.pojo.Wy_goods_package;
import com.zybaiyou.wycfuser.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class GoodsServiceImpl implements GoodsService {


    @Autowired
    Wy_goods_packageMapper wy_goods_packageMapper;
    public List<Wy_goods_package> GetRecommendGoodsPackage() {
        return wy_goods_packageMapper.GetRecommendGoodsPackage();
    }
}
