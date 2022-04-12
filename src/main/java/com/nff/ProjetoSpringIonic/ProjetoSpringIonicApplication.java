package com.nff.ProjetoSpringIonic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ProjetoSpringIonicApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringIonicApplication.class, args);
	}

}
