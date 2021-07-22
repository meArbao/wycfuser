package com.zybaiyou.wycfuser.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

import java.sql.Timestamp;

@Data
public class Wy_info_service {

    @JSONField(name = "infoid")
    private long ser_id;
    private String serguid;
    private String stitle;
    private String sdescribe;
    private String spricedescribe;

    @JSONField(name = "storeid")
    private long store_id;
    private Integer sstatus;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Timestamp createtime;
    private String linkurl;
    private Integer ordercode;
    private String iimage;
    private String ithumbnail;
    private String idetails;
    private Integer viewnum;
    private Timestamp upcreatetime;
}
