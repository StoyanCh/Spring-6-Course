package com.example.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Анотация, която посочва, че това е Spring Boot апликация
public class MycoolappApplication {

	public static void main(String[] args) {
		//  || Used for Bootstrap the Spring Boot App
		//  VV
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
