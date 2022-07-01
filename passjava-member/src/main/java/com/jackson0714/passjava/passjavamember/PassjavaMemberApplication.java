package com.jackson0714.passjava.passjavamember;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.jackson0714.passjava.passjavamember.dao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.jackson0714.passjava.passjavamember.feign")
public class PassjavaMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassjavaMemberApplication.class, args);
    }

}
