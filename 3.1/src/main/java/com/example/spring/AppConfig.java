package com.example.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
/*
 * Buscando componentes en el paquete com.example
 * con la anotacion @ComponentScan
 */
@ComponentScan("com.example")
@Import(Infrastructure.class)
public class AppConfig {

}
