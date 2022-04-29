package com.example.alibabaCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: kangerbao
 * @createTime: 2022年04月29日 11:10:36
 * @version: 1.0
 * @Description:
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class },
        scanBasePackages = "com.example.*")
@EnableFeignClients
public class WebApption {
    public static void main(String[] args) {
        SpringApplication.run(WebApption.class, args);
    }
}
