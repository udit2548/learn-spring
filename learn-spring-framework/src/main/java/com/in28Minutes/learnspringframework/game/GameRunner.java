package com.in28Minutes.learnspringframework.game;

public class GameRunner {
	// tight coupling means like MarioGame game;
   private GamingConsole game;
                     // MarioGame game
   public GameRunner(GamingConsole game) {
	   this.game = game;
   }

public void run() {
	System.out.println("Running game: "+ game);
	game.up();
	game.down();
	game.right();
	game.left();
	
}
}
