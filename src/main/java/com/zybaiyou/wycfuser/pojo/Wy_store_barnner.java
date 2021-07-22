package com.zybaiyou.wycfuser.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import  lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.sql.Timestamp;

@Data
public class Wy_store_barnner {
    private long barnnerid;
    private long store_id;
    private String sbguid;
    private String title;
    private String images;
    private Integer sborderbycode;
    private Integer sbstatus;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Timestamp creattime;
    private Integer sb_is_recommend_index;
    private Integer stype;
    private String src;
}


