package com.jackson0714.passjava.passjavacontent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.jackson0714.passjava.passjavacontent.dao")
@EnableDiscoveryClient
public class PassjavaContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassjavaContentApplication.class, args);
    }

}
