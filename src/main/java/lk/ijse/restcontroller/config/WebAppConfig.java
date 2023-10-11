package lk.ijse.restcontroller.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("lk.ijse.restcontroller")
@EnableWebMvc
public class WebAppConfig {
}
