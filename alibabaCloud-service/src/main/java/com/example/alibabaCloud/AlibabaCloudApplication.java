package com.example.alibabaCloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.alibabaCloud.mappers"})
@EnableFeignClients(basePackages = {"com.example.*.api", "com.example.*.*.api"})
public class AlibabaCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaCloudApplication.class, args);
    }

}
