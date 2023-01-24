package com.anjali.spring.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anjali.spring.learnspringboot.game.GameRunner;
import com.anjali.spring.learnspringboot.game.MarioGame;
import com.anjali.spring.learnspringboot.game.SuperContra;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(LearnSpringBootApplication.class, args);
//		Iteration 1: - Tightly coupled
//		MarioGame mario = new MarioGame();
//		SuperContra superGame = new SuperContra();
//		GameRunner runner = new GameRunner(mario);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
