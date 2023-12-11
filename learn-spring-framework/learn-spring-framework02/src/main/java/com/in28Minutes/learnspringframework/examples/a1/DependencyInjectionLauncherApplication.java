package com.in28Minutes.learnspringframework.examples.a1;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Configuration

@Component
class YourBusinessClass{
	
	//@Autowired     // Field dependency injection type
	Dependency1 dependency1; 
	//@Autowired
	Dependency1 dependency2;
	
	// Constructor dependency injection type
	@Autowired                // It is not mandatory here to write this annotation in this type.
	public YourBusinessClass(Dependency1 dependency1, Dependency1 dependency2) {
		super();
		System.out.println("Constructor  dependency   - Setdependency");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
		
	}
	
	// Getting and setter dependency injection type
	
//    @Autowired	
//	public void setDependency1(Dependency1 dependency1) {
//    	System.out.println("Injecting dependency 1  - Setdependency 1");
//		this.dependency1 = dependency1;
//	}
//
//    @Autowired	
//	public void setDependency2(Dependency1 dependency2) {
//    	System.out.println("Injecting dependency 2 - Setdependency 2");
//		this.dependency2 = dependency2;
//	}
//
//
//	public String toString() {
//		return "Using " + dependency1 + " and " + dependency2;
//	}
}

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}

@ComponentScan

public class DependencyInjectionLauncherApplication {

	public static void main(String[] args) {
		// Configuration file setup and spring context steps
	try(var context= new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)){
	      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); 
	      System.out.println(context.getBean(YourBusinessClass.class));	      
	}
     
	}

}
