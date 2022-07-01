package com.jackson0714.passjava.passjavachannel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.jackson0714.passjava.passjavachannel.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class PassjavaChannelApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassjavaChannelApplication.class, args);
    }

}
