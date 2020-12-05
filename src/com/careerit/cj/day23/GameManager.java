package com.careerit.cj.day23;

import java.util.concurrent.ThreadLocalRandom;

abstract class Game {
	public void start() {
		System.out.println("Game is going to start");
	}

	abstract void play();

	public void stop() {
		System.out.println("Game is going to stop");
	}
}

class Car extends Game {
	@Override
	public void play() {
		System.out.println("Playing..... Car Game....");

	}
}

class Bike extends Game {
	@Override
	public void play() {
		System.out.println("Playing.... Bike Game....");
	}

}

class Bicycle extends Game {
	@Override
	public void play() {
		System.out.println("Playing... Bicycle Game.....");
	}

}
class Ship extends Game{

	@Override
	public void play() {
		System.out.println("Playing.... ship Game.....");
		
	}
	
}

public class GameManager {

	public static void main(String[] args) {

		Game game = getRandomGame();
		game.start();
		game.play();
		game.stop();

	}

	private static Game getRandomGame() {

		Game[] game = new Game[] { new Car(), new Bike(), new Bicycle(),new Ship() };
		return game[ThreadLocalRandom.current().nextInt(0, 4)];
	}
}
