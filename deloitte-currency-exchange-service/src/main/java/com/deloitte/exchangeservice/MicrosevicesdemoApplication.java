package com.deloitte.exchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicrosevicesdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosevicesdemoApplication.class, args);
	}

}
