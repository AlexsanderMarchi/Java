package br.com.farmacia.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ConfigurationSecurity {

//  @Bean
//  public UserDetailsService dadosUsuarios(){
//    UserDetails usuario1 = User.builder()
//        .username("teste@")
//        .password("{noop}123")
//        .build();
//    UserDetails usuario2 = User.builder()
//        .username("teste2@")
//        .password("{noop}456")
//        .build();
//    return new InMemoryUserDetailsManager(usuario1, usuario2);
//  }

  @Bean
  public SecurityFilterChain filtrosSeguranca(HttpSecurity http) throws Exception{
    return http.authorizeHttpRequests(req -> {
      req.requestMatchers("/css/**", "/js/**", "/assets/**", "/.well-known/**").permitAll();
      req.anyRequest().authenticated();
    }).formLogin(form -> form.loginPage("/login")
        .defaultSuccessUrl("/home", true)
        .permitAll())
        .logout(logout -> logout.logoutSuccessUrl("/login?logout").permitAll())
        .rememberMe(rememberMe -> rememberMe.key("LembrarDeMim").alwaysRemember(true))
        .csrf(Customizer.withDefaults())
        .build();
  }

  @Bean
  public PasswordEncoder codificadorSenha(){
      return new BCryptPasswordEncoder();
  }
}
