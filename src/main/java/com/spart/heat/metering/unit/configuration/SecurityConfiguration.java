package com.spart.heat.metering.unit.configuration;

import com.spart.heat.metering.unit.service.UserDetailsServiceImpl;
import com.vaadin.flow.spring.annotation.EnableVaadin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.rcp.RemoteAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    private final UserDetailsServiceImpl userDetailsServiceImpl;

    public SecurityConfiguration(UserDetailsServiceImpl userDetailsServiceImpl) {
        this.userDetailsServiceImpl = userDetailsServiceImpl;
    }

    @Order(0)
    @Configuration
    public class SecuredWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests().antMatchers("/opros/unit/*", "/opros/login").permitAll()
                    .and()
                    .httpBasic()
                    .and().csrf().disable();
        }

    }

    @Order(2)
    @Configuration
    public class PublicWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.antMatcher("/opros/user/add")
//                    .antMatcher("/login")
//                    .antMatcher("/unitinfo")
                    .authorizeRequests()
                    .anyRequest()
                    .permitAll()
                    .and().csrf().disable();


    }

    @Order(1)
    @Configuration
    public class VaadinWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
        private static final String LOGIN_PROCESSING_URL = "/login";
        private static final String LOGIN_FAILURE_URL = "/login";
        private static final String LOGIN_URL = "/login";
        private static final String LOGOUT_SUCCESS_URL = "/login";
        @Override
        protected void configure(HttpSecurity http) throws Exception {

            http.csrf().disable()
                    .requestCache().requestCache(new CustomRequestCache())
                    .and().authorizeRequests()
                    .requestMatchers(SecurityUtils::isFrameworkInternalRequest).permitAll()
                    .anyRequest().authenticated()
                    .and().formLogin().loginPage(LOGIN_URL).permitAll().loginProcessingUrl(LOGIN_PROCESSING_URL)
                    .defaultSuccessUrl("/unitinfo")
                    .failureUrl(LOGIN_FAILURE_URL)
                    .and().logout().logoutSuccessUrl(LOGOUT_SUCCESS_URL);
        }
    }
}

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsServiceImpl);
    }


    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers(
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
