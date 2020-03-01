package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    cat cat1 = (cat) context.getBean("cat1");
	    cat1.print();
	    cat cat2 = (cat) context.getBean("cat2");
	    cat2.print();
	  }
}
