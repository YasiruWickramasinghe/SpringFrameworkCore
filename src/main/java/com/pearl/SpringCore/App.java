package com.pearl.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Archive Dependency Injection

//step 1 - create two class and call then in main method

	//
	//Bike bike = new Bike();
	//bike.drive();
	//Car car = new Car();
	//car.drive();

//step 2 - Implement interface to clear dependency like Bike , car 

	//
	//Vehicle obj = new Bike();
	//obj.drive();

//step 3 - above part only change left side only, but right side dependency also here
	//
	// use dependency injection bean() to overcome this
	// we can use BeanFactory or ApplicationContext
	//ApllicationContext is better
	//
	//ApplicationContext context = new ClassPathXmlApplicationContext();
	//
	//Vehicle object = (Vehicle)context.getBean("vehicle");
	//object.drive();

//step 4 - define XML file to choose what class to use in bean (bike or car) 
	//
	//create xml file
	//
	//<?xml version="1.0" encoding="UTF-8"?>
	//
	//<beans xmlns="http://www.springframework.org/schema/beans"
	//  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	//  xsi:schemaLocation="http://www.springframework.org/schema/beans 
	//  http://www.springframework.org/schema/beans/spring-beans.xsd 
	//  http://www.springframework.org/schema/context/ 
	//  http://www.springframework.org/schema/context/spring-context.xsd">
	//  
	//	<bean id="vehicle" class="com.pearl.SpringCore.Bike"></bean>
	//	
	//</beans>
	//
	//add application context to xml name to identify xml
	//
	//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Vehicle obj = (Vehicle)context.getBean("vehicle");
    	obj.drive();
    }
}
