package com.inxinet.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebserviceApplication {

	public static void main(String[] args) {
		
		// WebService with SpringBoot and JPA-Hibernate - e.g.311 - many-to-many association between Product and OrderItem
		SpringApplication.run(WebserviceApplication.class, args);
	}

}
