package com.api.api.configuracao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MinhaConfiguracao {

    @Bean
    public String nome() {
        return "Aula 2";
    }

    @Bean
    public String versao() {
        return "1.0";
    }
}
