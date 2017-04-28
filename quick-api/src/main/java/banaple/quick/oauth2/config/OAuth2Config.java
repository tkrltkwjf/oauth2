package banaple.quick.oauth2.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

public class OAuth2Config extends ResourceServerConfigurerAdapter {
	@Bean
    public TokenStore JdbcTokenStore(DataSource dataSource) {
        return new JdbcTokenStore(dataSource);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable();

        //http.authorizeRequests().anyRequest().permitAll();
        http.authorizeRequests().antMatchers("/api/**").authenticated();
    }


}
