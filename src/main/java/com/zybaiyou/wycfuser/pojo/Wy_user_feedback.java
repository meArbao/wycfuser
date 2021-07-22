package com.zybaiyou.wycfuser.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

import java.sql.Timestamp;

@Data
public class Wy_user_feedback {
    private long fb_id;
    @JSONField(name= "uid")
    private long user_id;
    private String fguid;
    private String fcontent;
    private Integer fstatus;
    private String freply;
    private Timestamp createtime;
    private Timestamp replycreatetime;
    private String replyadmin;
}
