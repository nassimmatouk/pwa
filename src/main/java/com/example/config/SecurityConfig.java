/*package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.example.entities.User;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/h2-console/**").permitAll() // Autoriser l'accès à la console H2
                .anyRequest().authenticated() // Protéger toutes les autres pages
            )
            .formLogin() // Activer le formulaire de connexion avec les paramètres par défaut
            .and() // Nécessaire pour revenir à HttpSecurity pour d'autres configurations
            .csrf().disable() // Désactiver CSRF pour permettre à H2 de fonctionner correctement
            .headers().frameOptions().disable(); // Permettre l'affichage des frames pour H2

        return http.build();
    }

    @Bean
        public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        return new InMemoryUserDetailsManager(
            User.username("admin")
            .password(passwordEncoder().encode("adminpassword"))
            .roles("ADMIN")
            .build()
                
        );
    }
}
*/