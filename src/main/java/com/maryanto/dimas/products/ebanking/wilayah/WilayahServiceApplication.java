package com.maryanto.dimas.products.ebanking.wilayah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WilayahServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WilayahServiceApplication.class, args);
    }
}
