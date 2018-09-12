package com.gegoo.servicecilent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceCilentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCilentApplication.class, args);
    }
}
