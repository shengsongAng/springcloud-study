package com.ang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class EurekaCustomApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCustomApplication.class, args);
    }

    @Bean
    public RestTemplate restTempl(){
        return new RestTemplate();
    }
}
