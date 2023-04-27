package com.skillstorm.project.project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//import com.skillstorm.project.project1.Scene;
//import com.skillstorm.project.project1.Player;
public class Controller {

	public static void main(String[] args) {
		Controller game1 = new Controller();
		game1.runGame();

	}

	Scene intro1 = new Scene(Scene.awakening,"123", "321", "132");
	
	Scene intro2 = new Scene( Scene.introduction, "123", "321", "132");

	Scene battle1 = new Scene(Scene.deathMountain, Scene.deathMountainBattlePrompt, Scene.deathMountainWin,
			Scene.battleLose);
	Scene battle2 = new Scene(Scene.zorasDomain, Scene.zorasDomainBattlePrompt, Scene.zorasDomainWin,
			Scene.battleLose);
	Scene battle3 = new Scene(Scene.sacredRealm, Scene.sacredRealmBattlePrompt, Scene.sacredRealmWin,
			Scene.battleLose);
	Scene battle4 = new Scene(Scene.templeOfTime, Scene.templeOfTimeBattlePrompt, Scene.templeOfTimeWin,
			Scene.battleLose);
	Scene finalBattle = new Scene(Scene.ganonsCastle, Scene.ganonBattlePrompt, Scene.rescueZelda, Scene.battleLose);

	public void runGame() {
		Scene currentScene = intro1;
//		currentScene = intro1;
//		System.out.println();
		System.out.println(currentScene.getSceneSetup());
		System.out.println("==============================================================================================");
		Player player1 = new Player();
		player1.setHearts(3);
		System.out.println("Hello, hero. Do you remember your name? \nEnter your name:");
		Scanner in = new Scanner(System.in);
		player1.setName(in.nextLine());
		currentScene = intro2;
		System.out.println("==============================================================================================");
		System.out.println(player1.getName() + currentScene.getSceneSetup());
		System.out.println("==============================================================================================");
		System.out.println(
				"First, let's refresh your memory of your fighting style.\n1. A strength-based Warrior weilding a sword and shield.\n2. A magic-based Mage with a magic infused staff. \n3. A nimble, dexterity-based Archer who specialized in bows. \nEnter 1, 2, or 3.");

		int classChoice = in.nextInt();

//		while (player1.getClass().equals(null)) {

		if (classChoice != 1 && classChoice != 2 && classChoice != 3) {
			System.out.println("Please choose a valid selection.");
		}
		if (classChoice == 1) {
			player1.createWarrior();
		} else if (classChoice == 2) {
			player1.createMage();
		} else if (classChoice == 3) {
			player1.createArcher();
		}

//		}
		System.out.println(player1);
		System.out.println("==============================================================================================");

		ArrayList<Scene> mainScenes = new ArrayList<>(4);
		mainScenes.add(battle1);
		mainScenes.add(battle2);
		mainScenes.add(battle3);
		mainScenes.add(battle4);
		Collections.shuffle(mainScenes);

		for (Scene current : mainScenes) {
			currentScene = current;
			if (player1.getHearts() > 0) {
				System.out.println(currentScene.getSceneSetup());
				System.out.println("==============================================================================================");
				System.out.println(currentScene.getBattlePrompt());
				int battleSelection = in.nextInt();
				if (battleSelection == 1)
					if (player1.getStrength() < 10) {
						System.out.println("==============================================================================================");
						System.out.println(currentScene.getBattleResultLose());
						player1.setHearts(player1.getHearts() - 1);
					} else {
						System.out.println("==============================================================================================");
						System.out.println(currentScene.getBattleResultWin());
					}
				if (battleSelection == 2)
					if (player1.getMagic() < 10) {
						System.out.println("==============================================================================================");
						System.out.println(currentScene.getBattleResultLose());
						player1.setHearts(player1.getHearts() - 1);
					} else {
						System.out.println(currentScene.getBattleResultWin());
					}
				if (battleSelection == 3)
					if (player1.getDexterity() < 10) {
						System.out.println("==============================================================================================");
						System.out.println(currentScene.getBattleResultLose());
						player1.setHearts(player1.getHearts() - 1);
					} else {
						System.out.println("==============================================================================================");
						System.out.println(currentScene.getBattleResultWin());
					}
			} else
				break;
		}
		if (player1.getHearts() > 0) {
			currentScene = finalBattle;
			System.out.println("==============================================================================================");
			System.out.println(currentScene.getSceneSetup());
			System.out.println("==============================================================================================");
			System.out.println(currentScene.getBattlePrompt());
			int bossSelection = in.nextInt();
			if (bossSelection == 2) {
				System.out.println("==============================================================================================");
				System.out.println(currentScene.getBattleResultWin());
				System.out.println();
			} else {
				System.out.println("==============================================================================================");
				System.out.println("You have failed to save the Princess. Try again to save her and the land of Hyrule.\nGAME OVER");
			}

		} else {
			System.out.println("///////////////////////////////////////////\nSorry, you have run out of hearts. Try again to save the Princess.\nGAME OVER");
		}

		in.close();
	}

}
