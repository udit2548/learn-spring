package com.in28Minutes.learnspringframework.game;

public class MarioGame implements GamingConsole{
	
	public void up(){
		System.out.println("Jump");
	}
	public void down(){
		System.out.println("Go into a hole");
	}
	public void right(){
		System.out.println("Accelerate");
	}
	public void left(){
		System.out.println("Go Back");
	}

}
