package com.in28Minutes.learnspringframework.examples.d1;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy                    // Lazy Initialization - when specific bean to be initialized or used after the completion of spring
                         // context application startup.
class ClassB{
	ClassA classA;
	public ClassB(ClassA classA){
		// Logic
		System.out.println("Some Initialization is happening");
		this.classA = classA;
		
	}
	public void doSomething() {
		System.out.println("Something is happening");
	}
}

@Configuration
@ComponentScan

public class LazyInitializationLauncherApplication{

	public static void main(String[] args) {
		// Configuration file setup and spring context steps
	try(var context= new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
	      System.out.println("Initialization of context is completed");
	      context.getBean(ClassB.class).doSomething(); // In lazy initialization type whenever it has been made 
	                                          // use of or called or made to use explicitly using context.getbean....
	                                          // default one is eager initialization..
	}
     
	}

}
