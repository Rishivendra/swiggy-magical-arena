package com.magical.arena.swiggy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwiggyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiggyApplication.class, args);
		Player playerA = new Player("Player A", 50, 5, 10);
		Player playerB = new Player("Player B", 100, 10, 5);

		Game game = new Game(playerA, playerB);
		game.start();
	}

}
