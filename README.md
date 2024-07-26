# Magical-Arena

## Overview:

**The Magical Arena game is a turn-based combat simulation between two players.**
- Each player has three main attributes: health, strength, and attack.
- Health: The amount of life a player has. If it reaches zero, the player dies.
- Strength: The player's defensive power.
- Attack: The player's offensive power.

## Gameplay:

**Initialization: Two players are created with specific values for health, strength, and attack.**
- Turns:
- Players take turns attacking each other.
- The player with lower health attacks first. If both have the same health, it doesn't matter who starts.

## Attack and Defense:
- The attacking player rolls a dice (values 1 to 6) to determine the attack multiplier.
- The defending player rolls a dice to determine the defense multiplier.
- The attacker's damage is calculated by multiplying their attack value with their dice roll.
- The defender's defense is calculated by multiplying their strength value with their dice roll.
- The defender's health is reduced by the difference between the attacker's damage and the defender's defense (if the attacker's damage is greater).
## Game End:
- The game continues until one player's health reaches zero.
- The player who still has health remaining is declared the winner.

## Requirements
- Java Development Kit (JDK)
- Eclipse IDE
- JUnit 4

## Project Structure
- src/main/java (Player.java) : Class has private attributes for name, health, strength, and attack inside com.magical.arena.swiggy package.
- src/main/java (Game.java): Contains the main source code files which is inside com.magical.arena.swiggy package. 
- src/test/java (PlayerTest.java): Contains the test source code files which is inside com.magical.arena.swiggy package. 
- pom.xml: Maven project configuration file.

## How to Build and Run
=> To import the project into Eclipse:
- Open Eclipse IDE.
- Select "File" -> "Import" -> "Existing Maven Projects".
- Browse to the project directory and select it.
- Click "Finish".
