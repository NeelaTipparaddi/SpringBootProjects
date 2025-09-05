package com.springproject.app;

import com.springproject.app.model.Computer;
import com.springproject.app.model.Laptop;
import com.springproject.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SringBootPracticeApplication{
	private Computer computer;

	public static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(SringBootPracticeApplication.class, args);
		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);



//		Alien dev = context.getBean(Alien.class);
//		dev.code();
//		System.out.println(dev.getAge());
	}

}
