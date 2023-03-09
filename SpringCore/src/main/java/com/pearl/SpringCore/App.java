package com.pearl.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

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
		// ApllicationContext is better
		//
		//ApplicationContext context = new ClassPathXmlApplicationContext();
		//
		//Vehicle object = (Vehicle)context.getBean("vehicle");
		//object.drive();
	
	//step 4 - define XML file to choose what class to use in bean (bike or car) 
		//
		//We can configuration using three ways
		//1.xml configuration
		//
			//
			//<?xml version="1.0" encoding="UTF-8"?>
			//
			//<beans xmlns="http://www.springframework.org/schema/beans"
			//  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			//  xsi:schemaLocation="http://www.springframework.org/schema/beans 
			//  http://www.springframework.org/schema/beans/spring-beans.xsd ">
			//  
			//	<bean id="vehicle" class="com.pearl.SpringCore.Bike"></bean>
			//	
			//</beans>
			//
			//add application context to xml name to identify xml
			//
			//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//2.annotation configuration
			//
			//here in child class we define @component then we no need to define beans in xml file
			//we use @Component instead of <bean id="vehicle" class="com.pearl.SpringCore.Bike"></bean> this
			//change child class
				//package com.pearl.SpringCore;
				//
				//import org.springframework.stereotype.Component;
				//
				//@Component
				//public class Car implements Vehicle{
				//	
				//	public void drive() {
				//		System.out.println("Honda Civic");
				//	}
				//}
			//change in xml
				//<context:component-scan base-package="com.pearl.SpringCore"></context:component-scan>
			//in main class
				//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
				//
				//Vehicle obj = (Vehicle)context.getBean("car");
				//obj.drive();
		//3.java configuration
			//


	//step 5 - insert property tag inside bean
		//create Tyre class and create object in main class

		//Two ways to set propery 
		//1.setter injection
			//create getters and setters in tyre class
			//change xml file
				//<bean id="tyre" class="com.pearl.SpringCore.Tyre">
				//<property name="brand" value="MRF"></property>
				//</bean>
			//call the object

		//2.constructor injection
			//create constructor in tyre class
			//change xml file
			//<constructor-arg value="MRF"></constructor-arg>

	//step 6 - Autowired Annotation

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
//    	Vehicle obj = (Vehicle)context.getBean("car");
//    	obj.drive();
    	
//    	Tyre t = (Tyre)context.getBean("tyre");
//    	System.out.println(t);
    	
    	Car obj = (Car)context.getBean("car");
    	obj.drive();
    }
}
