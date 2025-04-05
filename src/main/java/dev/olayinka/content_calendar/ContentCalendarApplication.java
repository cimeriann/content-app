package dev.olayinka.content_calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

import static com.fasterxml.jackson.databind.type.LogicalType.Array;

@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentCalendarApplication.class, args);
	}

}
