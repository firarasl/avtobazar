package az.autobazar.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//@Configuration
public class AutoBazarSecurityInterceptorConfig implements WebMvcConfigurer{

    @Autowired
    AutoBazarSecurityInterceptor interceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(interceptor).addPathPatterns("/user/**","/admin/**","/autoshop/**");
    }
}