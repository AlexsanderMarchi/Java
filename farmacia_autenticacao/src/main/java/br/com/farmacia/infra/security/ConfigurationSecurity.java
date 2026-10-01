package br.com.farmacia.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ConfigurationSecurity {

  @Bean
  public UserDetailsService dadosUsuarios(){
    UserDetails usuario1 = User.builder()
        .username("teste@")
        .password("{noop}123")
        .build();
    UserDetails usuario2 = User.builder()
        .username("teste2@")
        .password("{noop}456")
        .build();
    return new InMemoryUserDetailsManager(usuario1, usuario2);
  }
}
