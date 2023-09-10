package ru.emelianov.springedu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.emelianov.springedu")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
