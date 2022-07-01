package com.jackson0714.passjava.passjavastudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.jackson0714.passjava.passjavastudy.dao")

public class PassjavaStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassjavaStudyApplication.class, args);
    }

}
