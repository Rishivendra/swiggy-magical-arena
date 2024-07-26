package com.magical.arena.swiggy;

class Player {
	private String name;
	private int health;
	private int strength;
	private int attack;

	public Player(String name, int health, int strength, int attack) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getStrength() {
		return strength;
	}

	public int getAttack() {
		return attack;
	}

	public void reduceHealth(int amount) {
		this.health -= amount;
		if (this.health < 0) {
			this.health = 0;
		}
	}

	public boolean isAlive() {
		return this.health > 0;
	}

	@Override
	public String toString() {
		return name + " [Health: " + health + ", Strength: " + strength + ", Attack: " + attack + "]";
	}
}