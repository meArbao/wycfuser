package com.zybaiyou.wycfuser.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class Wy_goods_package {
    private Integer p_id;
    private String ptitle;

    @JSONField(serialize = false)
    private String pdescribe;
    private BigDecimal pprice;
    private BigDecimal ppreferential_price;
    private String pgoods;
    private String ptea_specifications;
    private String ptea_parameters;
    private String pproduction_ate;
    private String pbrand;
    private String ppacking_type;
    private String ptypes_of_tea;
    private String pgrowing_season;
    private String porigin;
    private String pshape;
    private String plevel;
    private String ptaste;
    private String pshelflife;
    private Integer pisrecommend;
    private String store_ids;
    private Timestamp pcreatetime;
    private Integer pstatus;

    @JSONField(serialize = false)
    private String pdetails;
    private String pimage;
    private String pemphasize;
    private String pimage_ithumbnail;

    private Integer salenum;
}
