package com.zybaiyou.wycfuser.config;

import lombok.*;

@Data
public class ResultData {
    private Integer status;
    private boolean success;
    private String msg;
    private Object data;

    public static ResultData success(Object data) {
        return resultData(0,ResponseCode.SUCCESS.msg(),true,data);

    }

    public static ResultData fail(int code, String msg,boolean blsucesccd) {
        return resultData(code, msg, blsucesccd,null);

    }
    public static ResultData fail(int code, String msg,boolean blsucesccd, Object data) {
        return resultData(code, msg,blsucesccd, data);

    }

    private static ResultData resultData(int code, String msg,boolean blsucesccd, Object data) {
        ResultData resultData = new ResultData();
        resultData.setStatus(code);
        resultData.setMsg(msg);
        resultData.setSuccess(blsucesccd);
        resultData.setData(data);
        return resultData;
    }

}
