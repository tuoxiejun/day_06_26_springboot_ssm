package com.qf.day_06_26_springboot_ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
@EnableTransactionManagement
public class Day0626SpringbootSsmApplication {

    public static void main(String[] args) {

        SpringApplication.run(Day0626SpringbootSsmApplication.class, args);
    }

}
