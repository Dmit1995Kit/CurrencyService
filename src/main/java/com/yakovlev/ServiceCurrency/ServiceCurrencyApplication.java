package com.yakovlev.ServiceCurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.yakovlev.ServiceCurrency.ClientFeign",
		"com.yakovlev.ServiceCurrency.controller"})
public class ServiceCurrencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCurrencyApplication.class, args);
	}

}
