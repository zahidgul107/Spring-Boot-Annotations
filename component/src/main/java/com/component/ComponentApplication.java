package com.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.component.controller.PizzaControlller;

@SpringBootApplication
public class ComponentApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(ComponentApplication.class, args);
		PizzaControlller pizzaController = context.getBean(PizzaControlller.class);
	//	PizzaControlller pizzaController = (PizzaControlller) context.getBean("pizzaDemo");
	//	PizzaControlller pizzaController = (PizzaControlller) context.getBean("pizzaControlller");
		System.err.println(pizzaController.getPizza());
		
		// By class
	//	VegPizza vegPizza = context.getBean(VegPizza.class);
		// By Name
	//	VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean");
		// By method name
//		VegPizza vegPizza = (VegPizza) context.getBean("vegPizza");
//		System.err.println(vegPizza.getPizza());
				
	}

}
