package com.fatec.projeto.projeto2025.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customoOpenAPI(){
        return new OpenAPI()
               .info(new Info()
                     .title("API de Projeto 2025 - Sementre 1")
                     .version("1.0")
                     .description("Documentação de API do Projeto 2025 - Semestre 1"));

    }
}
