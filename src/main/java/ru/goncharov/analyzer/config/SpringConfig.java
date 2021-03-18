package ru.goncharov.analyzer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan(basePackages = "ru.goncharov.analyzer")
@Configuration
public class SpringConfig {
}
