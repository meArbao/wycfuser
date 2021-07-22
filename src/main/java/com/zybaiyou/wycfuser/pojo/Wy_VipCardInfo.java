package com.zybaiyou.wycfuser.pojo;

import lombok.*;

import java.math.BigDecimal;

@Data
public class Wy_VipCardInfo {
    private String uname;
    private String uphone;
    private BigDecimal totalscore;
    private BigDecimal totalcash;
    private String cardno;
}
