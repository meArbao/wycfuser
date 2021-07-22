package com.zybaiyou.wycfuser.controller;

import com.alibaba.fastjson.JSON;
import com.zybaiyou.wycfuser.config.Results;
import com.zybaiyou.wycfuser.mapper.Wy_user_feedbackMapper;
import com.zybaiyou.wycfuser.pojo.Wy_user_feedback;
import com.zybaiyou.wycfuser.service.Wy_user_feedbackService;
import com.zybaiyou.wycfuser.utils.RandomGUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.List;

/**
 * @Title: 无忧茶坊--信息类
 * <p>
 * Description:
 * </p>
 * @author: MeArbao
 * @version 创建时间：2021年7月6日
 */
@RestController
@RequestMapping("/wyapiu")
public class InfoController {

    @Autowired
    Wy_user_feedbackService wy_user_feedbackService;
    //添加留言
    @RequestMapping("/addfeedback")
    public String AddFeedback(Wy_user_feedback wuf) {
        RandomGUID myGUID = new RandomGUID();
        String fguid= myGUID.toString().toLowerCase().replace("-","");
        wuf.setFguid(fguid);

        if(wuf.getFstatus()==null){wuf.setFstatus(0);}
        if(wuf.getCreatetime()==null){wuf.setCreatetime(new Timestamp(new Date().getTime()));}


        System.out.println("开始--读取-------");
//
        String rt= null;
        try {

            int inn= wy_user_feedbackService.addFeedback(wuf);

            Results results= new Results();
            if(inn>0)
            {
                results = new Results();
                results.setStatus(0);
                results.setSuccess(true);
                results.setMsg("添加留言成功。");
                rt = JSON.toJSONString(results);
            }
            else
            {

                results = new Results();
                results.setStatus(1);
                results.setSuccess(false);
                results.setMsg("添加留言失败。");
                rt = JSON.toJSONString(results);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("start1-------");
        rt= rt.replace("/\n/g","").replace("/\r/g","").replace("<","&lt;").replace(">","&gt;");
        rt=rt.replace("\'","\"");

        return  rt;
    }
}