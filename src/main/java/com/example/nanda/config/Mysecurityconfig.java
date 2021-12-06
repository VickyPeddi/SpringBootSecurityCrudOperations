package com.example.nanda.config;

import com.example.nanda.dao.Userrepos;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@AllArgsConstructor
@NoArgsConstructor
public class Mysecurityconfig extends WebSecurityConfigurerAdapter {
    @Autowired
    public Userrepos repos;
//	@Autowired
//	Jwtfilter Jwtfilter;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // Our public endpoints
                .antMatchers("/api/public/**").permitAll()
                .antMatchers(HttpMethod.GET, "/testuser/**").permitAll()
                .antMatchers(HttpMethod.POST, "/testuser/adduser").permitAll()
                .antMatchers("/user/**").permitAll()
                // Our private endpoints
                .anyRequest().authenticated();
        http = http.cors().and().csrf().disable();
    }

//	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
//	@Override
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		return super.authenticationManagerBean();
//	}

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(username -> repos
                .getUserByUsername(username));

    }

    @Bean
    public PasswordEncoder encoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
