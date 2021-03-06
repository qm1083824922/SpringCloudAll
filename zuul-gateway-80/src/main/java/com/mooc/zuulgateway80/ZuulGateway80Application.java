package com.mooc.zuulgateway80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulGateway80Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway80Application.class, args);
    }

}
