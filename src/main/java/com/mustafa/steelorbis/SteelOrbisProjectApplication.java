package com.mustafa.steelorbis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication()
@EntityScan(basePackages = "com.mustafa.steelorbis.entity")
public class SteelOrbisProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SteelOrbisProjectApplication.class, args);
	}

}
