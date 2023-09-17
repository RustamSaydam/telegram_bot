package io.avito_message.SpringAvitoBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,  })
public class SpringAvitoBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAvitoBotApplication.class, args);
	}

}
