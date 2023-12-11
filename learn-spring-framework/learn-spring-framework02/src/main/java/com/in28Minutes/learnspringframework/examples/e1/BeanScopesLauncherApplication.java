package com.in28Minutes.learnspringframework.examples.e1;
import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
class NormalClass{
	
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass{
	
}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication{

	public static void main(String[] args) {
		
		// Configuration file setup and spring context steps
	try(var context= new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)){
		
		// In singleton scope, it returns same instance or bean every time.
		// by default singleton scope applies to every bean.
		 System.out.println(context.getBean(NormalClass.class));
		 System.out.println(context.getBean(NormalClass.class));
		 System.out.println(context.getBean(NormalClass.class));
		 
	// In prototype scope, each time it returns a different instance/bean  when requested from spring launcher application context.
		 System.out.println(context.getBean(PrototypeClass.class));  
		 System.out.println(context.getBean(PrototypeClass.class));
		 System.out.println(context.getBean(PrototypeClass.class));
		 
		 
		
		
	      //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); 
	}
     
	}

}
