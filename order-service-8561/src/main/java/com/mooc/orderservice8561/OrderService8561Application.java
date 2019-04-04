package com.mooc.orderservice8561;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderService8561Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderService8561Application.class, args);
    }

}
