package com.skillstorm.project.project1;
import java.util.ArrayList;
import java.util.Arrays;
public class Player {
		static final int MAX_HEARTS = 5;
		private String name;
		private String playerClass;
		private int strength;
		private int magic;
		private int dexterity;
		private int hearts;
//		ArrayList<String> availableClasses = new ArrayList<>(Arrays.asList("Warrior", "Mage", "Archer")) ;
		
		public Player() {
			
		}
		
		public Player(String name, String playerClass, int strength, int magic, int dexterity) {
			this.setName(name);
			this.setPlayerClass(playerClass);
			this.setStrength(strength);
			this.setDexterity(dexterity);
			this.setMagic(magic);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPlayerClass() {
			return playerClass;
		}

		public void setPlayerClass(String playerClass) {
			this.playerClass = playerClass;
		}

		public int getStrength() {
			return strength;
		}

		public void setStrength(int strength) {
			this.strength = strength;
		}

		public int getMagic() {
			return magic;
		}

		public void setMagic(int magic) {
			this.magic = magic;
		}

		public int getDexterity() {
			return dexterity;
		}

		public void setDexterity(int dexterity) {
			this.dexterity = dexterity;
		}

		public int getHearts() {
			return hearts;
		}

		public void setHearts(int hearts) {
			this.hearts = hearts;
		}
		public String createWarrior() {
			setPlayerClass("Warrior");
			setStrength(10);
			setMagic(3);
			setDexterity(7);
			return "You have chosen the Warrior class. \nStrength = 10\nMagic = 3\nDexterity = 7";
		}
		public String createMage() {
			setPlayerClass("Mage");
			setStrength(3);
			setMagic(10);
			setDexterity(7);
			return "You have chosen the Mage class. \nStrength = 3\nMagic = 10\nDexterity = 7";
		}
		public String createArcher() {
			setPlayerClass("Warrior");
			setStrength(7);
			setMagic(3);
			setDexterity(10);
			return "You have chosen the Warrior class. \nStrength = 7\nMagic = 3\nDexterity = 10";
		}
}
