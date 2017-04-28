package banaple.quick.oauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import banaple.quick.oauth2.service.RepositoryService;

@SpringBootApplication
@EnableResourceServer
@EnableAuthorizationServer
public class QuickApiApplication implements CommandLineRunner{
	@Autowired
	RepositoryService repositoryService;

	public static void main(String[] args) {
		SpringApplication.run(QuickApiApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		repositoryService.saveMember();
	}
}
