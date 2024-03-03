package com.isyeon.listmyhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ListmyhomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListmyhomeApplication.class, args);
	}

	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                //registry.addMapping("/**").allowedOrigins("http://front-server.com");//도메인 생기면 수정할 것 
            	//registry.addMapping("/**").allowedOrigins("http://localhost:8081");
            }
        };
    }
}
