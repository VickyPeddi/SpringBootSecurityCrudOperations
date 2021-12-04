package com.example.nanda.config;

import org.springframework.context.annotation.Configuration;

//@EnableWebSecurity
@Configuration

public class Mysecurityconfig
//extends WebSecurityConfigurerAdapter 
{
//	@Autowired
//	public CustomUserdetailsservice userdetailsservicemine;
//	@Autowired
//	Jwtfilter Jwtfilter;
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().authorizeRequests().antMatchers("/base/generatetoken").permitAll().anyRequest()
//				.authenticated();
////        http.addFilterBefore(Jwtfilter, UsernamePasswordAuthenticationFilter.class);
//
//	}
//
//	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
//	@Override
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		return super.authenticationManagerBean();
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userdetailsservicemine);
//
//	}
//
//	@Bean
//	public PasswordEncoder encoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
}
