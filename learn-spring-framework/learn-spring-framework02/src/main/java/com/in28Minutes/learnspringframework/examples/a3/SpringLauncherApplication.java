package com.in28Minutes.learnspringframework.examples.a3;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration


class BusinessCalculationService{
	
	DataService dataService;
	
	@Autowired
	// Constructor Dependency Injection
	public BusinessCalculationService(DataService dataService){
		super();
		this.dataService = dataService;
	}
	
	public int findMax(){
		return Arrays.stream(dataService.retrieveData()).max().orElse(0); // dataService bean of which type will it become will be decided
		                                                                  // at runtime and is managed by spring.
	}

}
@ComponentScan
public class SpringLauncherApplication{
	public static void main(String args[]) {
		try(var context = new AnnotationConfigApplicationContext(SpringLauncherApplication.class)){
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}

