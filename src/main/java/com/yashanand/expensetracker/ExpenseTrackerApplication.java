package com.yashanand.expensetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.yashanand.expensetracker.config.JwtConfig;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
@EnableConfigurationProperties(JwtConfig.class)
public class ExpenseTrackerApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load(); // Load .env file

		System.setProperty("spring.datasource.url", dotenv.get("DB_URL"));
		System.setProperty("spring.datasource.username", dotenv.get("DB_USERNAME"));
		System.setProperty("spring.datasource.password", dotenv.get("DB_PASSWORD"));

		System.setProperty("app.jwt.secret", dotenv.get("JWT_SECRET"));
		System.setProperty("app.jwt.expiration", dotenv.get("JWT_EXPIRATION_MS"));
		SpringApplication.run(ExpenseTrackerApplication.class, args);
	}

}
