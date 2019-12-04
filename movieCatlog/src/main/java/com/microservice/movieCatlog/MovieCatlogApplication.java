package com.microservice.movieCatlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.microservice.movieCatlog")
public class MovieCatlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatlogApplication.class, args);
	}

}
