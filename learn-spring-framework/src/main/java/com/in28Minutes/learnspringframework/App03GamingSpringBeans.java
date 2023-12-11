package com.in28Minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28Minutes.learnspringframework.game.GameRunner;
import com.in28Minutes.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		// Configuration file setup and spring context steps
	try(var context= new AnnotationConfigApplicationContext(GamingConfiguration.class)){
		  context.getBean(GamingConsole.class).up();
		  context.getBean(GameRunner.class).run();
	}
     
	}

}
