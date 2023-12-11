package com.in28Minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28Minutes.learnspringframework.game.GameRunner;
import com.in28Minutes.learnspringframework.game.GamingConsole;
import com.in28Minutes.learnspringframework.game.PacMan;
import com.in28Minutes.learnspringframework.game.SuperContraGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
      var game  = new PacMan();
      return game;
    }
	@Bean
	public GameRunner gameRunner(GamingConsole game) { // Autowiring of game object in gamerunner bean object.
      var gameRunner  = new GameRunner(game);
      return gameRunner;
    }
	}
