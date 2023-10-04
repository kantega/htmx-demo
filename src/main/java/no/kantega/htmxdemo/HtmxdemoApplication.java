package no.kantega.htmxdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

@SpringBootApplication
public class HtmxdemoApplication {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("no", "no"));
		SpringApplication.run(HtmxdemoApplication.class, args);
	}
}
