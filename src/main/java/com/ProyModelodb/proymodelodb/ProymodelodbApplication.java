package com.ProyModelodb.proymodelodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.context.annotation.ComponentScan;
import jakarta.servlet.http.HttpServletResponse;


@SpringBootApplication
//@ComponentScan(basePackages = {"com.ProyModelodb.Controllers", "com.ProyModelodb.Models", "com.ProyModelodb.Repositories"})

public class ProymodelodbApplication 


{

	public static void main(String[] args) {
		SpringApplication.run(ProymodelodbApplication.class, args);
	}

	@Bean
    public WebMvcConfigurer forwardToIndex() {
        return new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("forward:/index.html");
            }
        };
    }

	
    public void handleRequest(HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_FOUND); // 302 redirect
        response.setHeader("Location", "/usuarios.html");
    }


}



