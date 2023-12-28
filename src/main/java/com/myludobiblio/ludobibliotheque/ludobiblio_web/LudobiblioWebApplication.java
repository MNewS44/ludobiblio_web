package com.myludobiblio.ludobibliotheque.ludobiblio_web;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = {"com.myludobiblio.ludobibliotheque.core.service.biblio", "com.myludobiblio.ludobibliotheque.core.service.ludo", "com.myludobiblio.ludobibliotheque.core.repository.biblio", "com.myludobiblio.ludobibliotheque.core.repository.ludo"})
public class LudobiblioWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LudobiblioWebApplication.class, args);
	}

	@Bean
	public Hibernate5Module datatypeHibernateModule(){
		Hibernate5Module module = new Hibernate5Module();
		module.disable(Hibernate5Module.Feature.USE_TRANSIENT_ANNOTATION);
		return module;
	}
}
