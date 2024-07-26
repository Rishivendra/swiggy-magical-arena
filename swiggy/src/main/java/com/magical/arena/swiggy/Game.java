package com.magical.arena.swiggy;

import java.util.Random;

class Game {
	private Player player1;
	private Player player2;
	private Random random;

	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.random = new Random();
	}

	private int rollDice() {
		return random.nextInt(6) + 1;
	}

	public void start() {
		System.out.println("Game Start!");
		System.out.println(player1);
		System.out.println(player2);

		while (player1.isAlive() && player2.isAlive()) {
			if (player1.getHealth() < player2.getHealth()) {
				attack(player1, player2);
			} else {
				attack(player2, player1);
			}
			System.out.println(player1);
			System.out.println(player2);
		}

		if (player1.isAlive()) {
			System.out.println(player1.getName() + " wins!");
		} else {
			System.out.println(player2.getName() + " wins!");
		}
	}

	private void attack(Player attacker, Player defender) {
		int attackRoll = rollDice();
		int defendRoll = rollDice();

		int attackDamage = attacker.getAttack() * attackRoll;
		int defendStrength = defender.getStrength() * defendRoll;

		int damage = attackDamage - defendStrength;
		if (damage > 0) {
			defender.reduceHealth(damage);
		} else {
			damage = 0;
		}

		System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damage
				+ " damage (attack roll: " + attackRoll + ", defend roll: " + defendRoll + ")");
	}
}
