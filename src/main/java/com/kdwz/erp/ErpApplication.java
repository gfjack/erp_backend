package com.kdwz.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan("com.*")
@SpringBootApplication
public class ErpApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ErpApplication.class, args);
    }

}
