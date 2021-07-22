package com.zybaiyou.wycfuser.interceptor;

import com.zybaiyou.wycfuser.annotation.PassToken;
import com.zybaiyou.wycfuser.annotation.VerifySign;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

@Component
public class AuthenticateInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("prehandle");
//        String token = httpServletRequest.getHeader("token");// 从 http 请求头中取出 token
        String token=request.getParameter("token");
        // 如果不是映射到方法直接通过
        if(!(handler instanceof HandlerMethod)){
            System.out.println("prehandle0");
            return true;
        }

        HandlerMethod handlerMethod=(HandlerMethod)handler;
        Method method=handlerMethod.getMethod();
//        https://blog.csdn.net/adu521525/article/details/101793952/
        //检查是否有passtoken注释，有则跳过认证
        if (method.isAnnotationPresent(PassToken.class)) {
            System.out.println("prehandle1");

            PassToken passToken = method.getAnnotation(PassToken.class);

            //当前的注解在HomeController的方法中适用
            if (!passToken.required()) {
                return false;
            }

        }

        if(StringUtils.isEmpty(token))
        {
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("无效的token");
            return false;
        }


        String sign=request.getParameter("sign");
        //检查是否有要签名跳过认证
        if (method.isAnnotationPresent(VerifySign.class)) {
            System.out.println("prehandle1");

            VerifySign verifySign = method.getAnnotation(VerifySign.class);

            //当前的注解在HomeController的方法中适用
            if (!verifySign.required()) {
                return false;
            }

        }


        if(StringUtils.isEmpty(sign))
        {
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("无效的签名");
            return false;
        }

        return true;

    }
}
