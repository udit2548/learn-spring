package com.in28Minutes.learnspringframework.examples.g;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

// Highlighting the usage of CDI Jakarta EE.
//@Component
@Named
class BusinessService{
	private DataService dataService;
	//@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection");
		this.dataService = dataService;
		
	}

	public DataService getDataService() {
		return dataService;
	}
     
	
	
	
}

@Component
class DataService{
	
	
}
@Configuration
@ComponentScan

public class CDIContextLauncherApplication{

	public static void main(String[] args) {
		
		
		// Configuration file setup and spring context steps
	try(var context= new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)){
	   System.out.println(context.getBean(BusinessService.class).getDataService());
		
	      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); 
	      	}
     
	}

}
