package com.ynz.demo.eyesconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EyesConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EyesConfigServerApplication.class, args);
	}
}
