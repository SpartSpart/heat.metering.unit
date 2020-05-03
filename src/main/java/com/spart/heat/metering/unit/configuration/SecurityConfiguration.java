package com.spart.heat.metering.unit.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration {

    @Order(0)
    @Configuration
    public static class SecuredWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.antMatcher("/opros/**").httpBasic()
                    .and()
                    .authorizeRequests()
                    .antMatchers("/opros/user/add", "/opros/login").permitAll()
                    .and()
                    .authorizeRequests()
                    .antMatchers("/opros/unit/*").authenticated()
                    .and().csrf().disable();
        }
    }

//    @Order(0)
//    @Configuration
//    public static class RegistrationWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http.antMatcher("/registration").httpBasic()
//                    .and()
//                    .authorizeRequests()
//                    .antMatchers("/registration").permitAll()
//                    .and().csrf().disable();
//        }
//    }

    @Order(1)
    @Configuration
    public static class VaadinWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
        private static final String LOGIN_PROCESSING_URL = "/login";
        private static final String LOGIN_FAILURE_URL = "/login";
        private static final String LOGIN_URL = "/login";
        private static final String LOGOUT_SUCCESS_URL = "/login";

        @Override
        protected void configure(HttpSecurity http) throws Exception {

            http.csrf().disable()
                    .requestCache().requestCache(new CustomRequestCache())
                    .and()
                    .authorizeRequests()
                    .requestMatchers(SecurityUtils::isFrameworkInternalRequest).permitAll()
                    .anyRequest()
                    .authenticated()
                    .and().formLogin().loginPage(LOGIN_URL).permitAll().loginProcessingUrl(LOGIN_PROCESSING_URL)
                    .defaultSuccessUrl("/unitinfo")
                    .failureUrl(LOGIN_FAILURE_URL)
                    .and().logout().logoutSuccessUrl(LOGOUT_SUCCESS_URL);
        }

        @Override
        public void configure(WebSecurity web) {
            web.ignoring().antMatchers(
                    "/registration",
                    "/VAADIN/**",
                    "/favicon.ico",
                    "/robots.txt",
                    "/manifest.webmanifest",
                    "/sw.js",
                    "/offline-page.html",
                    "/icons/**",
                    "/images/**",
                    "/frontend/**",
                    "/webjars/**",
                    "/h2-console/**",
                    "/frontend-es5/**", "/frontend-es6/**");
        }
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
