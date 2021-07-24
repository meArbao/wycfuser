package com.zybaiyou.wycfuser.utils;

import org.springframework.util.StringUtils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class PayCommonUtil {

    //    https://blog.csdn.net/wb_zjp283121/article/details/82965538
    //定义签名，微信根据参数字段的ASCII码值进行排序 加密签名,故使用SortMap进行参数排序
    public static String createSign(String characterEncoding, SortedMap<String, String> parameters) {
        StringBuffer sb = new StringBuffer();
        Set es = parameters.entrySet();
        Iterator it = es.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String k = (String) entry.getKey();
            Object v = entry.getValue();
            if (null != v && !"sign".equals(k) && !"key".equals(k)&&null != k) {
                sb.append(k + "=" + v + "&");
            }
        }

        //sb.append("key=" + ConstantUtil.PARTNER_KEY);//最后加密时添加商户密钥，由于key值放在最后，所以不用添加到SortMap里面去，单独处理，编码方式采用UTF-8

        String strsign=sb.toString();
        if(!StringUtils.isEmpty(strsign))
        {
            if(strsign.substring(0,strsign.length()-1).equals("&"))
            {
                strsign=strsign.substring(strsign.length()-1,1);
            }
        }


        String sign = MD5Util.MD5Encode(strsign, characterEncoding).toUpperCase();
        return sign;
    }
}