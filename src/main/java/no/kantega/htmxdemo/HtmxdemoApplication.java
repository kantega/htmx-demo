package no.kantega.htmxdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class HtmxdemoApplication {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("nb_NO"));
		SpringApplication.run(HtmxdemoApplication.class, args);
	}

}
