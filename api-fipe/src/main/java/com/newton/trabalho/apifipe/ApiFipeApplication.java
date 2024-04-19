package com.newton.trabalho.apifipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {com.newton.trabalho.apifipe.controller.CarDataController.class})
public class ApiFipeApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiFipeApplication.class, args);
	}
}
