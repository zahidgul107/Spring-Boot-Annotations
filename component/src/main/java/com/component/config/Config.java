package com.component.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.component.controller.PizzaControlller;
import com.component.service.NonVegPizza;
import com.component.service.Pizza;
import com.component.service.VegPizza;

@Configuration
public class Config {

    @Bean
    Pizza vegPizza() {
		return new VegPizza();
	}
	
    @Bean
	Pizza nonVegPizza() {
		return new NonVegPizza();
	}
    
    @Bean(initMethod = "init", destroyMethod = "destroy")
    PizzaControlller pizzaController() {
    	return new PizzaControlller(vegPizza());
    }

}
