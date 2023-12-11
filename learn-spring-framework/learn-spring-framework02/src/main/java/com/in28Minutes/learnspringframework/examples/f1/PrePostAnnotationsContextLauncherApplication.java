package com.in28Minutes.learnspringframework.examples.f1;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass{
	private SomeDependency someDependency;
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("Dependencies ready after injection or autowiring");
		}
	
	@PostConstruct   // this annotation to be used as soon as the dependencies are ready and auto-wired and dependency injection 
	// and then some initialization or performing some operation  like fetching data from the database.     
	public void initialization() {
		someDependency.doSomeTask();
	}
	
	@PreDestroy   // before bean is destroyed from the spring container.
	public void doSomeBefore() {
		System.out.println("Deallocation before releasing resource");
	}
	
}

@Component
class SomeDependency{
	public void doSomeTask() {
		System.out.println("Some Logic performed after initialisation using somedependency");
	}
	
}





@Configuration
@ComponentScan

public class PrePostAnnotationsContextLauncherApplication{

	public static void main(String[] args) {
		// Configuration file setup and spring context steps
	try(var context= new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)){
	      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); 
	}
     
	}

}
