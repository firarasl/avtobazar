package az.autobazar.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class AutoBazarSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AutoBazarUserDetailsService userDetailsService;

    @Autowired
    private AutoBazarAuthenticationSuccessHandler authenticationSuccessHandler;

    @Autowired
    private AutoBazarAuthenticationFailureHandler authenticationFailureHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//         setup autorization
        http.//csrf().disable().
//                sessionManagement().maximumSessions(1).maxSessionsPreventsLogin(true)
                authorizeRequests()
                .antMatchers("/admin/**").hasAnyRole("AUTOBAZAR_ADMIN", "AUTOBAZAR_MODERATOR")
                .antMatchers("/user/**").hasAnyRole("AUTOBAZAR_USER", "AUTOBAZAR_ADMIN")
//                .antMatchers("/autoshop/**").hasAnyRole("AUTOBAZAR_")
                .antMatchers("/").permitAll()
                .and()
                .formLogin()
                    .loginPage("/login").permitAll()
                    .usernameParameter("autobazar_username")
                    .passwordParameter("autobazar_password")
//                    .successForwardUrl("/user/")
                    .successHandler(authenticationSuccessHandler)
                    .failureHandler(authenticationFailureHandler)
                .and()
                    .rememberMe().userDetailsService(userDetailsService);
//                    .defaultSuccessUrl("/user/welcome");

//        http.httpBasic()
//                .and().csrf().disable()
//                .formLogin().disable()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/rest/flexible-list/**").hasAnyRole("AUTOBAZAR_ADMIN")
//                .antMatchers(HttpMethod.POST, "/rest/flexible-list/**").hasAnyRole("AUTOBAZAR_ADMIN", "AUTOBAZAR_MODERATOR")
//                .antMatchers(HttpMethod.PUT, "/rest/flexible-list/**").hasAnyRole("AUTOBAZAR_ADMIN", "AUTOBAZAR_MODERATOR")
//                .antMatchers(HttpMethod.DELETE, "/rest/flexible-list/**").hasRole("AUTOBAZAR_ADMIN");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // setup authentication - in memory
//        auth.inMemoryAuthentication()
//                .withUser("tofiq")
//                .password("canada")
//                .roles("AUTOBAZAR_ADMIN")
//                .and()
//                .withUser("ali")
//                .password("123456")
//                .roles("AUTOBAZAR_USER");

        auth.authenticationProvider(authenticationProvider());
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService);
        authenticationProvider.setPasswordEncoder(getPasswordEncoder());
        return authenticationProvider;
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
