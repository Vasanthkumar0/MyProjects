package com.App_Curd1.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Employeeconfig implements WebMvcConfigurer {

	 public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/employee").setViewName("employee");
	    }
}
