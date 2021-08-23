package com.lixiang.tron.serviceprovideralpha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceProviderAlphaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderAlphaApplication.class, args);
    }

}
