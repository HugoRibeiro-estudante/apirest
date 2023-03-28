package com.iftm.apirest;

import com.iftm.apirest.models.Email;
import com.iftm.apirest.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApirestApplication.class, args);
		User user1 = new User(1L, "Hugo","Ribeiro","HUGO","1234","34993379793","nao sei");

	}

}
