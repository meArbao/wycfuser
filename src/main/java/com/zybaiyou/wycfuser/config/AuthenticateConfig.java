package com.zybaiyou.wycfuser.config;


import com.zybaiyou.wycfuser.interceptor.AuthenticateInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AuthenticateConfig implements WebMvcConfigurer {

   @Autowired
   AuthenticateInterceptor authenticateInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticateInterceptor).addPathPatterns("/wyapiu/getbanners");
    }
}
