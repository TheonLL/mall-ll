package com.macro.mall.tiny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = { "com.macro.mall.tiny.mbg.mapper"})
public class MallTiny01Application {
    public static void main(String[] args) {
        SpringApplication.run(MallTiny01Application.class, args);
    }

}
