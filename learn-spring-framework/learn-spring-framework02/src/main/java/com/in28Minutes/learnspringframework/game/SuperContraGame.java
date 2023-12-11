package com.in28Minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("SuperContraGameQualifier")
@Component
public class SuperContraGame implements GamingConsole{

	public void up(){
		System.out.println("up");
	}
	public void down(){
		System.out.println("dig down");
	}
	public void right(){
		System.out.println("go ahead");
	}
	
	public void left(){
		System.out.println("get back");
	}
}
