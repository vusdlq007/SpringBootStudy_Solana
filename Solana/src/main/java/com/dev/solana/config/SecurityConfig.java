package com.dev.solana.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    // spring Security Login 폼 비활성화.
    // csrf 보호 기능 비활성화.
    @Override
    protected void configure(HttpSecurity security) throws Exception{
        security.httpBasic().disable().formLogin().disable();
        security.csrf().disable();
    }
}

