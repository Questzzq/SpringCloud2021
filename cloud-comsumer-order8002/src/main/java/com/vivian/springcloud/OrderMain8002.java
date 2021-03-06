package com.vivian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author EricTseng
 * @date 2021/9/14 21:04
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain8002.class, args);
    }
}
