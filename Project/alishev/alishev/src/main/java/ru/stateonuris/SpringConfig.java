package ru.stateonuris;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.stateonuris")
@PropertySource("classpath:musicPlayer.propeties")
public class SpringConfig {
}
