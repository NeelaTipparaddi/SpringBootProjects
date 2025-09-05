package com.springsecurity.spring_sec_practice.config;

import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private UserDetailsService userDetailsService;
//connects with database and return the object
    @Bean
    public AuthenticationProvider authProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());

        return provider;
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(Customizer -> Customizer.disable())
                .authorizeHttpRequests(Request -> Request.anyRequest().authenticated())
//                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return http.build();
    }

//        http.csrf(Customizer->Customizer.disable());
//        http.authorizeHttpRequests(Request->Request.anyRequest().authenticated());
//        http.formLogin(Customizer.withDefaults());
//        http.httpBasic(Customizer.withDefaults());
//        http.sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//         return http.build();

//        Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new Customizer<CsrfConfigurer<HttpSecurity>>() {
//            @Override
//            public void customize(CsrfConfigurer<HttpSecurity> httpSecurityCsrfConfigurer) {
//                httpSecurityCsrfConfigurer.disable();
//            }
//        };
//        http.csrf(custCsrf);
//        @Bean
//        public UserDetailsService userDetailsService(){
////            UserDetails user = User.builder()                  //does not encode passwords automatically (unlike the deprecated withDefaultPasswordEncoder()).
//            UserDetails user = User
//                    .withDefaultPasswordEncoder()   //  withDefaultPasswordEncoder() -> deprecated we should not use it in production
//                    .username("neela")
//                    .password("@neela11")
//                    .roles("USER")
//                    .build();
//
//    UserDetails admin = User
//            .withDefaultPasswordEncoder()
//            .username("admin")
//            .password("admin123")
//            .roles("ADMIN")
//            .build();
//            return new InMemoryUserDetailsManager(user, admin);
//}
}
