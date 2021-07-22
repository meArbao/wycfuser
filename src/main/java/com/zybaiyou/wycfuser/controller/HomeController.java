package com.zybaiyou.wycfuser.controller;

import com.alibaba.fastjson.JSON;
import com.zybaiyou.wycfuser.config.ResultDetail;
import com.zybaiyou.wycfuser.config.Results;
import com.zybaiyou.wycfuser.config.ResultsResponse;
import com.zybaiyou.wycfuser.mapper.Wy_VipCardInfoMapper;
import com.zybaiyou.wycfuser.mapper.Wy_goods_packageMapper;
import com.zybaiyou.wycfuser.mapper.Wy_info_serviceMapper;
import com.zybaiyou.wycfuser.mapper.Wy_store_barnnerMapper;
import com.zybaiyou.wycfuser.pojo.*;
import com.zybaiyou.wycfuser.service.GoodsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * @Title: 无忧茶坊--首页
 * <p>
 * Description:
 * </p>
 * @author: MeArbao
 * @version 创建时间：2021年7月1日
 */
@RestController
@RequestMapping("/wyapiu")
public class HomeController {

    @Autowired
    Wy_store_barnnerMapper wy_store_barnnerMapper;
    //获取首页的 banner
    @RequestMapping("/getbanners")
    public String Getbanners(String status) {

        System.out.println("开始--验证-------");
        Integer int_status=9;
        boolean is_status_empty= StringUtils.isEmpty(status);
        if(is_status_empty==false)
        {
            try {
                int_status=Integer.parseInt(status);
            } catch (NumberFormatException x) {
            }
        }
        System.out.println("开始--读取-------");

        String rt= null;
        try {

            List<Wy_store_barnner> wsb= wy_store_barnnerMapper.getBanners(int_status);
            if(wsb.size()>0)
            {
                ResultsResponse resultResponse= new ResultsResponse();
                resultResponse.setStatus(0);
                resultResponse.setMsg("获取信息成功");
                resultResponse.setSuccess(true);
                resultResponse.setResponse(wsb);
                rt = JSON.toJSONString(resultResponse);
            }
            else
            {
                Results results= new Results();
                results = new Results();
                results.setStatus(1);
                results.setMsg("获取信息失败，无数据。");
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


    @Autowired
    GoodsService goodsService;
    //获取首页的本期优惠套餐
    @RequestMapping("/getrecommendgoodspackage")
    public String GetRecommendGoodsPackage() {

        System.out.println("开始--验证-------");

        System.out.println("开始--读取-------");

        String rt= null;
        try {

            List<Wy_goods_package> wgp_list= goodsService.GetRecommendGoodsPackage();
            if(wgp_list.size()>0)
            {
                ResultsResponse resultResponse= new ResultsResponse();
                resultResponse.setStatus(0);
                resultResponse.setMsg("获取首页的本期优惠套餐成功");
                resultResponse.setSuccess(true);
                resultResponse.setResponse(wgp_list);
                rt = JSON.toJSONString(resultResponse);
            }
            else
            {
                Results results= new Results();
                results = new Results();
                results.setStatus(1);
                results.setMsg("获取首页的本期优惠套餐失败，无数据。");
                rt = JSON.toJSONString(results);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("start1-------");
        rt= rt.replace("/\n/g","").replace("/\r/g","").replace("<","&lt;").replace(">","&gt;");
        rt=rt.replace("\'","\"");
        rt=rt.replace("%","%25");
        rt=rt.replace("<section>","<div>");
        rt=rt.replace("</section>","</div>");
        rt=rt.replace("<section ","<div ");

        return  rt;
    }


    @Autowired
    Wy_info_serviceMapper wy_info_serviceMapper;
    //查看首页无忧服务
    @RequestMapping("/getinfoservice")
    public String GetInfoservice(String limitnum) {

        System.out.println("开始--验证-------");
        Integer int_limitnum=10;
        boolean is_status_empty= StringUtils.isEmpty(limitnum);
        if(is_status_empty==false)
        {
            try {
                int_limitnum=Integer.parseInt(limitnum);
            } catch (NumberFormatException x) {
            }
        }
        System.out.println("开始--读取-------");

        String rt= null;
        try {

            List<Wy_info_service> list_wsb= wy_info_serviceMapper.FindInfoServices(int_limitnum);
            if(list_wsb.size()>0)
            {
                ResultsResponse resultResponse= new ResultsResponse();
                resultResponse.setStatus(0);
                resultResponse.setMsg("获取首页无忧服务信息成功");
                resultResponse.setSuccess(true);
                resultResponse.setResponse(list_wsb);
                rt = JSON.toJSONString(resultResponse);
            }
            else
            {
                Results results= new Results();
                results = new Results();
                results.setStatus(1);
                results.setMsg("获取信息失败，无数据。");
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

    //根据ID获取无忧服务详细页
    @RequestMapping("/getinfoservicebyid")
    public String GetInfoServiceById(String infoid) {

        System.out.println("开始--验证-------getinfoservicebyid");
        Integer int_infoid=0;
        boolean is_infoid_empty= StringUtils.isEmpty(infoid);
        if(is_infoid_empty==false)
        {
            try {
                int_infoid=Integer.parseInt(infoid);
            } catch (NumberFormatException x) {
            }
        }
        System.out.println("开始--读取-------getinfoservicebyid");
        String rt= null;
        try {

            String fieldkeylist="*";
            Wy_info_service wis= wy_info_serviceMapper.getInfoServiceById(fieldkeylist,int_infoid);
            if(wis!=null)
            {

                wy_info_serviceMapper.addInfoServiceViewNum(int_infoid);
                int current_view_num=wis.getViewnum()+1;
                wis.setViewnum(current_view_num);
                ResultDetail resultDetail=new ResultDetail();
                resultDetail.setStatus(0);
                resultDetail.setMsg("根据ID获取无忧服务详细页成功。");
                resultDetail.setSuccess(true);
                resultDetail.setDetail(wis);
                rt = JSON.toJSONString(resultDetail);
            }
            else
            {
                Results results= new Results();
                results = new Results();
                results.setStatus(1);
                results.setMsg("根据ID获取无忧服务详细页成功失败，无数据。");
                rt = JSON.toJSONString(results);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("开始--显示-------getinfoservicebyid");
        rt= rt.replace("/\n/g","").replace("/\r/g","").replace("<","&lt;").replace(">","&gt;");
        rt=rt.replace("\'","\"");

        return  rt;
    }


    @Autowired
    Wy_VipCardInfoMapper wy_vipCardInfoMapper;
    //首页积分及现金数据
    //总收益，可提现，我邀请的，推荐奖，茶水费，茶友团
    @RequestMapping("/getvipcardinfo")
    public String GetVipCardInfo(String uid) {

        System.out.println("开始--验证-------getvipcardinfo");
        long user_id=0;

        boolean is_infoid_empty= StringUtils.isEmpty(uid);
        if(is_infoid_empty==false)
        {
            try {
                user_id=Integer.parseInt(uid);
            } catch (NumberFormatException x) {
            }
        }

        System.out.println("开始--读取-------getvipcardinfo");
        String rt= null;
        try {

            String fieldkeylist="*";
            List<List<?>>  wis= wy_vipCardInfoMapper.GetVipCardInfo(user_id);

            BigDecimal dec_total_revenue= ((ArrayList<BigDecimal>)wis.get(0)).get(0);
            BigDecimal passable_withdrawable= ((ArrayList<BigDecimal>)wis.get(1)).get(0);
            BigDecimal dec_total_score= ((ArrayList<BigDecimal>)wis.get(2)).get(0);


            Wy_VipCardInfo wy_vipCardInfo=((ArrayList<Wy_VipCardInfo>)wis.get(3)).get(0);
            wy_vipCardInfo.setTotalcash(passable_withdrawable);
            wy_vipCardInfo.setTotalscore(dec_total_score);
            if(wy_vipCardInfo!=null)
            {
                ResultDetail resultDetail=new ResultDetail();
                resultDetail.setStatus(0);
                resultDetail.setMsg("首页积分及现金数据详细页成功。");
                resultDetail.setSuccess(true);
                resultDetail.setDetail(wy_vipCardInfo);
                rt = JSON.toJSONString(resultDetail);
            }
            else
            {
                Results results= new Results();
                results = new Results();
                results.setStatus(1);
                results.setMsg("首页积分及现金数据失败，无数据。");
                rt = JSON.toJSONString(results);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("开始--显示-------");
        rt= rt.replace("/\n/g","").replace("/\r/g","").replace("<","&lt;").replace(">","&gt;");
        rt=rt.replace("\'","\"");

        return  rt;
    }
}
