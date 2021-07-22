package com.zybaiyou.wycfuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zybaiyou.wycfuser.mapper")
public class WycfuserApplication {

    public static void main(String[] args) {
        SpringApplication.run(WycfuserApplication.class, args);
    }

}
