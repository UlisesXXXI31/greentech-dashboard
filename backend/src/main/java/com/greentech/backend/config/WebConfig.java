package com.greentech.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class WebConfig implements WebMvcConfigurer {

@Value("${app.cors.allowed-origins}")
    private String allowedOrigins;

 @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") 
                // En lugar de "*", le damos los orígenes exactos permitidos de forma segura
                .allowedOrigins(
                    allowedOrigins,                            
                    "https://greentech-backend-8rmi.onrender.com", 
                    "http://localhost:8080"                      
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(true) // Al usar orígenes explícitos arriba, esto JAMÁS volverá a fallar
                .maxAge(3600);
    }
}