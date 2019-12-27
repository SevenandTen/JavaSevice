package com.qiqi.sevice.javasevice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@MapperScan("com.qiqi.sevice.javasevice.mapper")
@SpringBootApplication
public class JavaseviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaseviceApplication.class, args);
    }

}
