package com.pearl.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Spring Core Annotation

//create maven project
//create class called samsung
//call the class object in App.java
//create ApplicationContect fore Dipendency injection
//for configuration to create AppConfig class instead of using xml file
//specify AppConfiguration under application context object
//
//
//@Configuration -> this will be configuration file
//@ComponentScan -> scan all the components instead of manual config
//@Component -> which create class object undependancy
//@AutoWired -> search for object inside the class
//@Qualifier -> match the currect name of interface need to process


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory  = new AnnotationConfigApplicationContext(AppConfig.class);
    	
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
