package com.zybaiyou.wycfuser.pojo;

import lombok.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class Wy_finance_user_scoreflow {
    private long sf_id;
    private String sfguid;
    private long store_id;
    private String user_id;
    private BigDecimal score;
    private Integer scoreype;
    private Integer scorestatus;
    private Timestamp createtime;
    private String replay;
    private String memo;
    private String order_sn;
    private String third_other_sn;
    private Integer income_and_expenditure;
}
