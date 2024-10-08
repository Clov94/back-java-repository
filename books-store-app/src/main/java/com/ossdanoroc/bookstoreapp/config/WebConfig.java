package com.ossdanoroc.bookstoreapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Bean
	public WebMvcConfigurer corsConfig() {
		return new WebMvcConfigurer() {
			void addCorsMapping(CorsRegistry cors) {
				cors.addMapping("/**").allowedOrigins("http://localhost:3000")
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS").allowedHeaders("*")
						.allowCredentials(true);
			}
		};
	}
}
