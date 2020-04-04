package com.spring.cloud.eurek.client.eurekclient.eurekclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekClientApplication.class, args);
    }

}
