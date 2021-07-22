package com.zybaiyou.wycfuser.pojo;

import lombok.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class Wy_user_info {
    private long user_id;
    private String uguid;
    private String headimage;
    private String nickname;
    private String uphone;
    private String usex;
    private String upassword;
    private String webchat;
    private BigDecimal current_score;
    private BigDecimal current_cash;
    private String vip_cardno;
    private String username;
    private String relationmarker;
    private Integer ustatus;
    private Timestamp createtime;
    private String invitation_code;
    private String bankcardno;
    private String opening_bank;
    private String bank_account_owner;
    private String qrcodeurl;
    private String shareqrcodeurl;
}
