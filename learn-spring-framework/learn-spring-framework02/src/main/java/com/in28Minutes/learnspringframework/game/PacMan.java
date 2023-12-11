package com.in28Minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole{
	public void up(){
		System.out.println("step ahead");
	}
	public void down(){
		System.out.println("step back");
	}
	public void right(){
		System.out.println("step right");
	}
	
	public void left(){
		System.out.println("step left");
	}
}
