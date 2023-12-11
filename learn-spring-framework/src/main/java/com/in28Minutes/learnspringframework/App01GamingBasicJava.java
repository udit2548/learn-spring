package com.in28Minutes.learnspringframework;

import com.in28Minutes.learnspringframework.game.GameRunner;
import com.in28Minutes.learnspringframework.game.MarioGame;
import com.in28Minutes.learnspringframework.game.PacMan;
import com.in28Minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var gameMario = new MarioGame();
		/* Concept of Tight Coupling and Loose Coupling
		 * Tight Coupling directly all classes were participating with GameRunner Class.
		 * Tight Coupling making the things more specific and complex.
		 * Loose Coupling achieved with interface acting as bridge or intermediate.
		 * Loose Coupling making the things more general and simpler*/
		var gameSuperContra = new SuperContraGame(); // Object creation
		var pacMan = new PacMan();
		var gameRunner_mario = new GameRunner(gameMario);
		// dependency injection
        // autowiring of passing of the created object into GamingConsole interface.
		// Here it is done manually but now spring will do it implicitly.
		var gameRunner_supercontra = new GameRunner(gameSuperContra); 
		var gameRunner_pacman = new GameRunner(pacMan);
		
		gameRunner_mario.run();
		gameRunner_supercontra.run();
		gameRunner_pacman.run();
		

	}

}
