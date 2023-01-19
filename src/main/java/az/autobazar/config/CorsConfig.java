package az.autobazar.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class CorsConfig {

    @Value("${cors.origins}")
    private List<String> corsOrigins;

    @Bean
    public WebMvcConfigurer configurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {

                System.out.println("cors origins = " + corsOrigins);
                String[] cors = new String[corsOrigins.size()];
                for (int i = 0; i < cors.length; i++) {
                    cors[i] = corsOrigins.get(i);
                }

                registry.
                        addMapping("/rest/**")
                        .allowedOrigins(cors);
//                        .allowedOrigins(
//                                "http://autobazar.az",
//                                "https://autobazar.az",
//                                "http://www.autobazar.az",
//                                "https://www.autobazar.az",
//                                "http://test.autobazar.az"
////                                "http://localhost:63342"
//                                );
            }
        };
    }
}
