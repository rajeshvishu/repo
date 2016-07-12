package com.repo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class AppController {
	 public static void main(String[] args) {
	 ApplicationContext context = 
             new ClassPathXmlApplicationContext("myapp-servlet.xml");

      MyApp obj = (MyApp) context.getBean("MyApp");
      System.out.println(obj.getMessage());
	 }
}
