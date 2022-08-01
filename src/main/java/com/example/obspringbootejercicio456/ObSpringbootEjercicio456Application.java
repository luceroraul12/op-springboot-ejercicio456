package com.example.obspringbootejercicio456;

import com.example.obspringbootejercicio456.controller.LaptopController;
import com.example.obspringbootejercicio456.entities.Laptop;
import com.example.obspringbootejercicio456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObSpringbootEjercicio456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObSpringbootEjercicio456Application.class, args);
		LaptopController laptopController = context.getBean(LaptopController.class);
		Laptop l1, l2, l3;

		l1 = new Laptop(null, "HP-234", LocalDate.of(2020,5,12), 2435.34,true);
		l2 = new Laptop(null, "HP-356", LocalDate.of(2015,5,12), 2500.23,true);
		l3 = new Laptop(null, "HP-234", LocalDate.of(2010,5,12), 1000.2,false);

		laptopController.save(l1);
		laptopController.save(l2);
		laptopController.save(l3);

		System.out.println("Cantidad de laptops: "+ laptopController.count());

		System.out.println(laptopController.findAll());



	}

}
