package com.in28Minutes.learnspringframework.examples.a0;
import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28Minutes.learnspringframework.game.GameRunner;
import com.in28Minutes.learnspringframework.game.GamingConsole;
@Configuration
@ComponentScan

public class SimpleSpringContextLauncherApplication{

	public static void main(String[] args) {
		// Configuration file setup and spring context steps
	try(var context= new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)){
	      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); 
	}
     
	}

}
