package com.deloitte.conversionmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients("com.deloitte.conversionmicroservice.controller")
@EnableDiscoveryClient
public class DeloitteCurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeloitteCurrencyConversionServiceApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplateBean() {
		return new RestTemplate();
	}
	
}
