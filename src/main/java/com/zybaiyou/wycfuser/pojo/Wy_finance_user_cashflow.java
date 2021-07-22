package com.zybaiyou.wycfuser.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
@Data
public class Wy_finance_user_cashflow {
    private long cf_id;
    private String cfguid;
    private long store_id;
    private long user_id;
    private BigDecimal fee;
    private Integer feetype;
    private Integer feestatus;
    private Timestamp createtime;
    private Timestamp createtime4;
    private String replay;
    private String memo;
    private String order_sn;
    private String third_other_sn;
    private Integer income_and_expenditure;
}