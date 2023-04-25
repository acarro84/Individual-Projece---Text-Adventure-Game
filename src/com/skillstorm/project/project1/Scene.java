package com.skillstorm.project.project1;

import java.util.ArrayList;

public class Scene {
	ArrayList<Scene> scenes = new ArrayList<>();
	private int sceneNumber;
	private String sceneSetup;

	private String battlePrompt;
	private String battleResultWin;
	private String battleResultLose;
	String awakening = "You awaken, groggy and confused in a deep forest among a clearing of trees. \n"
			+ "At it's center is a large tree, seemingly as old as time itself. From behind the tree, \n"
			+ "a tiny fairy named Navi appears...\n";
	String introduction = "...much has happened since you dissappeared 10 years ago. \n"
			+ "Ganondorf, the evil wizard, has come to the land of Hyrule and is vying for power.\n"
			+ " You must defeat him and rescue Princess Zelda. \n"
			+ "Before you can defeat Ganondorf, you must find the Triforce, Light Arrows, Master Shield and the Master Sword. \n"
			+ "Your journey begins here.\n";
	String deathMountain = "You finally arrive at Death Mountain after a long walk. "
			+ "You are greeted by Darunia, the leader of the Gorons, who asks you to help deal with a problem in Dodongo's Cavern "
			+ "that has been plaguing his people. In exchange, he offers a relic that he found deep inside Death Mountain. "
			+ "Could this be one of the items you are searching for? You agree and arrive at the lair of the monster inside the cavern.";
	String deathMountainBattlePrompt = "Choose how you will best the monster of the Lair\n1. Ready your sword and sheild and "
			+ "charge at the Monster. You will be the better fighter today!\n2. Use your staff and summon a large ice shard "
			+ "from the moat surrounding the monster.\n3. Use your arrows to hit the monsters bulging eyes, blinding him.\n"
			+ "Choose 1, 2, or 3.";
	String deathMountainWin = "You have bested the beast inside the cavern by using your strengths wisely. "
			+ "Darunia is elated and hands you the relic: It's the Triforce!";
	String zorasDomain = "Your next adventure finds you in Zora's Domain. "
			+ "You heard rumors during your travels that a piece of the Triforce might be in this area. "
			+ "Almost immediately, you notice a gloom about this place and see spiderwebs connecting every corner of the room. "
			+ "In a dark hallway ahead, you can see the dark red glowing eyes. After a screech, a giant spider emerges from the darkness. "
			+ "En garde!";
	String zorasDomainBattlePrompt = "Choose how to dispatch the spider!\n1. Ram the spider with your sheild, pushing it off balance allowing "
			+ "you to strike with your sword.\n2. Ignite the webs surrounding the spider with your staff, engulfing it in flames.\n3. "
			+ "Shoot the large hanging chendelier over the spider, causing it to squish it like a bug.\nChoose 1, 2, or 3.";
	String zorasDomainWin = "Great! You've bested that giant spider and managed to rescue Ruto who was cacooned in spiderwebs in the corner. "
			+ "He thanks you and gives you the only thing he has left of any value: The Master Shield!";
	String sacredRealm = "Your next destination is the Sacred Realm. "
			+ "As you arrive, you can see a pedestal with a glimmering light in the distance. "
			+ "The whole realm seems to be suspended in space with only a narrow maze of paths zig-zagging through the air."
			+ " After many careful steps (and a few monsters slain, of course), you arrive at the pedestal. "
			+ "As you go to grab the light arrows, they dissappear and a blinding light stops you. It is Rauru, the Sage of Light. "
			+ "Before he will give you the Light Arrows, you must pass a trial to show that you are worthy to be the Hero of Light.";
	String sacredRealmBattlePrompt = "For this trial, Raaru wants you to open the sealed door that now holds the arrows.\n1. "
			+ "Try to use your strength to move the heavy pedestal on to the button in the corner to open the door.\n2. "
			+ "Summon a large boulder with earth magic on top of the button to open the door.\n3. "
			+ "Shoot an arrow at the switch on the ceiling, flooding a foot of water into the room and making the pedestal light "
			+ "enough to be moved to the button.\nChoose 1, 2, or 3.";
	String sacredRealmWin = "You've passed Rauru's trial. You walk up to the pedestal and grab the Light Arrows! On to your next journey!";
	String templeOfTime = "You've found something in the forest: It's the Ocarina of Time! You play a tune that you remember faintly from your childhood. "
			+ "Suddenly you are whisked away through time and end up in the Temple of Time. It's eerily quiet here. "
			+ "There are no enemies. Only a long path. This must be the Door of Time that Navi was telling me about."
			+ " But how could I possibly get in? As you step forward, a pressure plate activates the temple, and large swinging axes oscillate back and forth along your path.";
	String templeOfTimeBattlePrompt = "You must get through the path safely to the door. \n1. Use your strength and swordsmanship to cut each axe as it swings in front of you.\n"
			+ "2. Stop time using time magic with your staff, allowing you to walk freely to the door.\n3. "
			+ "Use your dexterity and nimbly dodge each axe as it swings, timing your moves carefully to get to the door.";
	String templeOfTimeWin = "You've made it inside the door! Inside is a small room with many weapon racks. All of them are empty except one. "
			+ "A sword rack in the corner with a lone sword resting in it. You walk up to the sword and grab it. "
			+ "It hums in your hand and glows, lighting the whole room. In your head you hear an angelic voice say: "
			+ "\"It's dangerous to go alone! Take This!\" You recieved the MASTER SWORD";
	String ganonsCastle = "You travel to Ganon's Castle after acquiring the Triforce, Light Arrows, Master Shield and Master Sword. "
			+ "You know you are now strong enough to take on Ganon and save Princess Zelda. "
			+ "You travel deep into his castle, dispatching enemies as they appear. "
			+ "Finally, you arrive at Ganondorf's throne room. "
			+ "Ganondorf proceeds to go on a 20 minute rant about why he is evil and doing evil things. "
			+ "You try to press the start button to skip all of the text but a message pops up in the corner. "
			+ "\"You Cannot Skip This\""
			+ "Out of the corner of your eye, you see Princess Zelda locked in a cage suspended above lava (for effect, of course). "
			+ "You allow him to finish his monologue and charge into battle!";
	String rescueZelda = "You utilize the power hidden in the Master Sword and the Light Arrows to weaken and then defeat Ganon. "
			+ "Before he dies, he uses the rest of his power to bring the castle down around him. "
			+ "You manage to escape with Princess Zelda and trap Ganon in the Sacred Realm. "
			+ "Hyrule will know peace for the first time since you fell into your deep sleep. ";
	String battleLose = "You have chosen a strategy that was...less than effective. You narrowly defeat your enemy and escape with your prize. It cost you a heart in the process.";
	
	Scene battle1 = new Scene(3, deathMountain, deathMountainBattlePrompt, deathMountainWin, battleLose );
	Scene battle2 = new Scene(4, zorasDomain, "",  zorasDomainWin, battleLose);
	Scene battle3 = new Scene(5, sacredRealm, "", sacredRealmWin, battleLose);
	Scene battle4 = new Scene(6, templeOfTime, "", templeOfTimeWin, battleLose);
	Scene finalBattle = new Scene(7, ganonsCastle, "",rescueZelda, battleLose);
	
	
	public Scene () {
		
	}
	public Scene (int sceneNumber, String sceneSetup, String battlePrompt, String battleResultWin, String battleResultLose) {
		this.setSceneNumber(sceneNumber);
		this.setSceneSetup(sceneSetup);
		this.setSceneSetup(battlePrompt);
		this.setBattleResultWin(battleResultWin);
		this.setBattleResultLose(battleResultWin);
		
	}
	
	public String getBattlePrompt () {
		return battlePrompt;
	}
	public void setBattlePrompt (String battlePrompt) {
		this.battlePrompt = battlePrompt;
	}
	
	public int getSceneNumber() {
		return sceneNumber;
	}
	public void setSceneNumber(int sceneNumber) {
		this.sceneNumber = sceneNumber;
	}


	public String getSceneSetup() {
		return sceneSetup;
	}
	public void setSceneSetup(String sceneSetup) {
		this.sceneSetup = sceneSetup;
	}


	public String getBattleResultWin() {
		return battleResultWin;
	}
	public void setBattleResultWin(String result) {
		this.battleResultWin = result;
	}
	public String getBattleResultLose() {
		return battleResultLose;
	}
	public void setBattleResultLose(String result) {
		this.battleResultLose = result;
	}
	
	public void sceneArrive() {
		
	}
	
//	public String battle() {
////		this.scen
//	}
	
	public int nextScene() {
//		current
		return 0;
	}


	


	
	
	
	
	
	
}
