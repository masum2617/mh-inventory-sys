package com.mh.inventory_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InventoryDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryDiscoveryApplication.class, args);
	}

}
