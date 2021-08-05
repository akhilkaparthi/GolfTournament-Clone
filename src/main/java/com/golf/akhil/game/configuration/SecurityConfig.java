package com.golf.akhil.game.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import javax.ws.rs.core.SecurityContext;
import java.time.LocalDateTime;
import java.util.Optional;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //This method is only for development not for production
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests().antMatchers("/").permitAll();
        httpSecurity.csrf().disable();
    }
}

@Configuration
@EnableJpaAuditing(auditorAwareRef = "springSecurityAuditorAware", dateTimeProviderRef = "utcDateTimeProvider")
class AuditingConfiguration{

    @Bean
    public DateTimeProvider utcDateTimeProvider(){
        return () -> Optional.of(LocalDateTime.now());
    }
    @Bean
    public AuditorAware<String> springSecurityAuditorAware() {
        return () -> {
            final String currentUser = SecurityContextHolder.getContext().getAuthentication().getName();
            return Optional.ofNullable(currentUser);

        };
    }

}

