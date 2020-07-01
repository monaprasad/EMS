/*
 * package com.eCommerce.gateway.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.password.NoOpPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * @EnableWebSecurity public class WebSecurityConfig extends
 * WebSecurityConfigurerAdapter{
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * 
 * http .authorizeRequests() .antMatchers("/", "/home").permitAll()
 * .anyRequest().authenticated() .and() .formLogin() .loginPage("/login")
 * .permitAll() .and() .logout() .permitAll();
 * 
 * http .authorizeRequests() .antMatchers("/user").hasRole("USER")
 * .antMatchers("/admin").hasRole("ADMIN")
 * .antMatchers("/greeting").hasRole("role")
 * .antMatchers("/login").permitAll().and().formLogin(); }
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception {
 * auth.inMemoryAuthentication().withUser("monika").password("pass").roles(
 * "USER") .and().withUser("vishal").password("password").roles("ADMIN")
 * .and().withUser("neha").password("1234").roles("role"); }
 * 
 * @Bean public PasswordEncoder getPasswordEncoder() { return
 * NoOpPasswordEncoder.getInstance();
 * 
 * }
 * 
 * }
 */