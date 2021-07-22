package com.zybaiyou.wycfuser.config;

import lombok.Data;
@Data
public class ResultsResponse extends Results {
    private Object response;

    private static Results resultResponse(int code, String msg,boolean blsucesccd, Object data) {
        ResultsResponse resultResponse = new ResultsResponse();
        resultResponse.setStatus(code);
        resultResponse.setMsg(msg);
        resultResponse.setSuccess(blsucesccd);
        resultResponse.setResponse(data);
        return resultResponse;
    }
}
