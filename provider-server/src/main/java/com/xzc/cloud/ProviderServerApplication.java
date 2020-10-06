package com.xzc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Ray
 * @date created in 2020/10/6 15:40
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderServerApplication.class, args);
    }
}
