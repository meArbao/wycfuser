package com.zybaiyou.wycfuser.config;
import lombok.Data;
@Data
public class ResultDetail extends Results {
    private Object detail;
    private static Results ResultDetail(int code, String msg,boolean blsucesccd, Object data) {
        ResultDetail resultDetail = new ResultDetail();
        resultDetail.setStatus(code);
        resultDetail.setMsg(msg);
        resultDetail.setSuccess(blsucesccd);
        resultDetail.setDetail(data);
        return resultDetail;
    }
}
