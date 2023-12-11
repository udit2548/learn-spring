package com.in28Minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.in28Minutes.learnspringframework.game")

public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		// Configuration file setup and spring context steps
	try(var context= new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
		  context.getBean(GamingConsole.class).up();
		  context.getBean(GameRunner.class).run();
	}
     

	}

}
