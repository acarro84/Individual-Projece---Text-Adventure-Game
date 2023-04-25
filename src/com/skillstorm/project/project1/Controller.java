package com.skillstorm.project.project1;
import java.util.Scanner;
public class Controller {

	public static void main(String[] args) {
		Controller game1 = new Controller();
		game1.runGame();
		
		

	}
	Scene awakening = new Scene( 1, "You awaken, groggy and confused in a deep forest among a clearing of trees. \n"
			+ "At it's center is a large tree, seemingly as old as time itself. From behind the tree, \n"
			+ "a tiny fairy named Navi appears...\n", "" ,"","");
	
	Scene introduction = new Scene( 2, "...much has happened since you dissappeared 10 years ago. \n"
			+ "Ganondorf, the evil wizard, has come to the land of Hyrule and is vying for power.\n"
			+ "You must defeat him and rescue Princess Zelda. \n"
			+ "Before you can defeat Ganondorf, you must find the Triforce, Light Arrows, Master Shield and the Master Sword. \n"
			+ "Your journey begins here.\n", "","","");
	
	public void runGame() {
		Scene currentScene = awakening;
		System.out.println(awakening.getSceneSetup());
		Player player1 = new Player();
		player1.setHearts(5);
		System.out.println("Hello, hero. Do you remember your name? \nEnter your name:");
		Scanner in = new Scanner(System.in);
		player1.setName(in.nextLine());
		
		System.out.println(player1.getName() + introduction.getSceneSetup());
		System.out.println("First, let's refresh your memory of your fighting style.\n1. A strength-based Warrior weilding a sword and shield.\n2. A magic-based Mage with a magic infused staff. \n3. A nimble, dexterity-based Archer who specialized in bows. \nEnter 1, 2, or 3.");
		
		
		int classChoice = in.nextInt();
		
		
//		while (player1.getClass().equals(null)) {
			
			if (classChoice != 1 &&classChoice != 2 && classChoice != 3) {
				System.out.println("Please choose a valid selection.");
			} if (classChoice == 1) {
				player1.createWarrior();
			} else if (classChoice == 2) {
				player1.createMage();
			} else if (classChoice == 3) {
				player1.createArcher();
			}
		
				
		
//		}
		System.out.println(player1);
		

		
		
//		while (player1.getHearts() > 0 && currentScene.getSceneNumber() <= 5) {
//			System.out.println(currentScene.getSceneSetup());
//			currentScene = currentScene.nextScene();
//		}
		
		in.close();
	}
	
}
