package com.yasmani.net.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfiguration {

	@Bean
	public SecurityWebFilterChain securityConfigurationTwo(ServerHttpSecurity http) {
		http
		.authorizeExchange(exchanges ->	
		exchanges.anyExchange().authenticated())
		.oauth2Login(Customizer.withDefaults());
		http.csrf(csrf -> csrf.disable());
		
		return http.build();
	}
}
