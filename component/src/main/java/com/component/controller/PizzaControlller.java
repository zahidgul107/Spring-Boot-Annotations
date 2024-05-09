package com.component.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.component.service.Pizza;
import com.component.service.VegPizza;

@Component
public class PizzaControlller {
	
	@Autowired
	@Qualifier("nonVegPizza")
	private Pizza pizza;
	
//	@Autowired
//	public PizzaControlller(VegPizza vegPizza) {
//		this.vegPizza = vegPizza;
//	}
	
//	@Autowired
//	public void setVegPizza(VegPizza vegPizza) {
//		this.vegPizza = vegPizza;
//	}
	
	public String getPizza() {
		return pizza.getPizza();
	}

}
