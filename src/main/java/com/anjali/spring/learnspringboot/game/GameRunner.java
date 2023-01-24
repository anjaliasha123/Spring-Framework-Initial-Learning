package com.anjali.spring.learnspringboot.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	/* Itteration -1
	private MarioGame game;
	private SuperContra superGame;
	public GameRunner(MarioGame mario) {
		this.game = mario;
	}
	public GameRunner(SuperContra superGame) {
		this.superGame = superGame;
	}
 * */
	//Iteration 2- interfaces
	@Autowired
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
