package com.zybaiyou.wycfuser.controller;

import com.zybaiyou.wycfuser.utils.MD5Util;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/t")
    public String toTest(String str) {

        if(StringUtils.isEmpty(str))
        {

            return "error";
        }
        String md= MD5Util.encrypt(str);
        return md;
    }
}
