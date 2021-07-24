package com.zybaiyou.wycfuser.controller;

import com.zybaiyou.wycfuser.utils.PayCommonUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/tsign")
    public String createSigns(@RequestParam(required = false) HashMap<String,String> map) {
        String characterEncoding="UTF-8";
        SortedMap<String,String> param=new TreeMap<String,String>(map);
        String md= PayCommonUtil.createSign(characterEncoding,param);

        return md;
    }
}
