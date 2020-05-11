package com.wlc.mcdscore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@SpringBootApplication
@RestController
public class McdscoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(McdscoreApplication.class, args);
	}

}

