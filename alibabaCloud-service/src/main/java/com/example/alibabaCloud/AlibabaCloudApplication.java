package com.example.alibabaCloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.alibabaCloud.mappers"})
@EnableFeignClients
@EnableDiscoveryClient
public class AlibabaCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaCloudApplication.class, args);
    }

}
