package com.priyanka.microservices.currecncyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication(exclude ={SecurityAutoConfiguration.class})
@EnableDiscoveryClient
public class CurrecncyExchangeServiceApplication {

	 
	public static void main(String[] args) {
		SpringApplication.run(CurrecncyExchangeServiceApplication.class, args);
	}

	//trace all request
			@Bean
			public Sampler defaultSampler() {
				return Sampler.ALWAYS_SAMPLE;
			}
}
