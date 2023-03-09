package com.pearl.SpringAnnotation;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // this will be configuration file
@ComponentScan(basePackages="com.pearl.SpringAnnotation") //scan all the components instead of manual config
public class AppConfig {

//	@Bean
//	 public Samsung getPhone() {
//		 return new Samsung();
//	 }
//	
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new Snapdragon();
//	}
	
}
	