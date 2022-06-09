package com.accountbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动项
@SpringBootApplication
@MapperScan("com.accountbook.mapper")
public class AccountBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountBookApplication.class, args);
    }

}
