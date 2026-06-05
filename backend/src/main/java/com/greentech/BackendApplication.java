package com.greentech.backend; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

// Forzamos a OpenAPI/Swagger a apuntar a la URL pública de tu contenedor en la nube
@OpenAPIDefinition(
    servers = {
        @Server(url = "https://humble-space-acorn-r475rq6wq7wwc55ww-8081.app.github.dev", description = "Servidor Codespaces Activo")
    }
)
@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }
    
    
}