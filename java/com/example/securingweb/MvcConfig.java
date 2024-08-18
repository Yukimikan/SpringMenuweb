package com.example.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/login").setViewName("login");
		//jsp
		registry.addViewController("/list").setViewName("list");
		registry.addViewController("/menu_csv_input").setViewName("menu_csv_input");
		registry.addViewController("/menu_csv_regist").setViewName("menu_csv_regist");
		registry.addViewController("/menu_csv_result").setViewName("menu_csv_result");
		registry.addViewController("/menu_search").setViewName("menu_search");
		registry.addViewController("/menu_result").setViewName("menu_result");
	}

}
