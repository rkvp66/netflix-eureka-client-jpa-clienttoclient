package com.eureka.client.jpa.clienttoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class EurekaClientJpaClienttoclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientJpaClienttoclientApplication.class, args);
	}

}
