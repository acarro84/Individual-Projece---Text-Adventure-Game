package com.skillstorm.project.project1;
import java.util.Scanner;
public class Controller {

	public static void main(String[] args) {
		Controller game1 = new Controller();
		game1.runGame();
		
		

	}
	Scene awakening = new Scene( 1, "You awaken, groggy and confused in a deep forest among a clearing of trees. \n"
			+ "At it's center is a large tree, seemingly as old as time itself. From behind the tree, \n"
			+ "a tiny fairy named Navi appears...\n", "" );
	
	Scene introduction = new Scene( 2, "...much has happened since you dissappeared 10 years ago. \n"
			+ "Ganondorf, the evil wizard, has come to the land of Hyrule and is vying for power.\n"
			+ "You must defeat him and rescue Princess Zelda. \n"
			+ "Before you can defeat Ganondorf, you must find the Triforce, Light Arrows, Master Shield and the Master Sword. \n"
			+ "Your journey begins here.\n", "");
	
	public void runGame() {
		Scene currentScene = awakening;
		System.out.println(awakening.getSceneSetup());
		Player player1 = new Player();
		player1.setHearts(5);
		System.out.println("Hello, hero. Do you remember your name? \nEnter your name:");
		Scanner enterName = new Scanner(System.in);
		player1.setName(enterName.nextLine());
		enterName.close();
		System.out.println(player1.getName() + introduction.getSceneSetup());
		
//		currentScene = introduction;
		// TODO scanner player name and class
		
		
//		while (player1.getHearts() > 0 && currentScene.getSceneNumber() <= 5) {
//			System.out.println(currentScene.getSceneSetup());
//			currentScene = currentScene.nextScene();
//		}
		
		
	}
	
}
