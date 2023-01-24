package com.anjali.spring.learnspringboot.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContra implements GamingConsole{
	public void up() {
		System.out.println("SuperContra Move up");
	}
	public void down() {
		System.out.println("SuperContra Move down");
	}
	public void left() {
		System.out.println("SuperContra Move left");
	}
	public void right() {
		System.out.println("SuperContra Move right");
	}
}
