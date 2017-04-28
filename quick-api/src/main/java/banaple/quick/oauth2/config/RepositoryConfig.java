package banaple.quick.oauth2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = {"banaple.quick.oauth2.repository"})
@EnableTransactionManagement
public class RepositoryConfig {

}
