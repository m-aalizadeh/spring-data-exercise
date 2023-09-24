package com.maryam.aalizadeh.jpadatasample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class JpaDataSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDataSampleApplication.class, args);

	}

}
