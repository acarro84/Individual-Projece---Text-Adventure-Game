package com.skillstorm.project.project1;

import java.util.ArrayList;

public class Scene {

	private String sceneSetup;
	private String battlePrompt;
	private String battleResultWin;
	private String battleResultLose;

	static String awakening = "You awaken, groggy and confused in a deep forest among a clearing of trees. \n"
			+ "At it's center is a large tree, seemingly as old as time itself. From behind the tree, \n"
			+ "a tiny fairy named Navi appears...\n";
	static String introduction = "...much has happened since you dissappeared 10 years ago. \n"
			+ "Ganondorf, the evil wizard, has come to the land of Hyrule and is vying for power.\n"
			+ "You must defeat him and rescue Princess Zelda. \n"
			+ "Before you can defeat Ganondorf, you must find the Triforce, Light Arrows, Master Shield and the Master Sword. \n"
			+ "Your journey begins here.\n";
	static String deathMountain = "You finally arrive at Death Mountain after a long walk.\n"
			+ "You are greeted by Darunia, the leader of the Gorons, who asks you to help deal with a problem in Dodongo's Cavern \n"
			+ "that has been plaguing his people. In exchange, he offers a relic that he found deep inside Death Mountain. \n"
			+ "Could this be one of the items you are searching for? You agree and arrive at the lair of the monster inside the cavern.";
	static String deathMountainBattlePrompt = "Choose how you will best the monster of the Lair\n1. Ready your sword and sheild and\n "
			+ "charge at the Monster. You will be the better fighter today!\n2. Use your staff and summon a large ice shard\n "
			+ "from the moat surrounding the monster.\n3. Use your arrows to hit the monsters bulging eyes, blinding him.\n"
			+ "Choose 1, 2, or 3.";
	static String deathMountainWin = "You have bested the beast inside the cavern by using your strengths wisely. \n"
			+ "Darunia is elated and hands you the relic: It's the Triforce!";
	static String zorasDomain = "Your next adventure finds you in Zora's Domain. \n"
			+ "You heard rumors during your travels that a piece of the Triforce might be in this area. \n"
			+ "Almost immediately, you notice a gloom about this place and see spiderwebs connecting every corner of the room.\n"
			+ "In a dark hallway ahead, you can see the dark red glowing eyes. After a screech, a giant spider emerges from the darkness. \n"
			+ "En garde!";
	static String zorasDomainBattlePrompt = "Choose how to dispatch the spider!\n1. Ram the spider with your sheild, pushing it off balance allowing\n"
			+ "you to strike with your sword.\n2. Ignite the webs surrounding the spider with your staff, engulfing it in flames.\n3. "
			+ "Shoot the large hanging chendelier over the spider, causing it to squish it like a bug.\nChoose 1, 2, or 3.";
	static String zorasDomainWin = "Great! You've bested that giant spider and managed to rescue Ruto who was cacooned in spiderwebs in the corner. \n"
			+ "He thanks you and gives you the only thing he has left of any value: The Master Shield!";
	static String sacredRealm = "Your next destination is the Sacred Realm.\n"
			+ "As you arrive, you can see a pedestal with a glimmering light in the distance. \n"
			+ "The whole realm seems to be suspended in space with only a narrow maze of paths zig-zagging through the air.\n"
			+ "After many careful steps (and a few monsters slain, of course), you arrive at the pedestal. "
			+ "As you go to grab the light arrows, \nthey dissappear and a blinding light stops you. It is Rauru, the Sage of Light. \n"
			+ "Before he will give you the Light Arrows, you must pass a trial to show that you are worthy to be the Hero of Light.";
	static String sacredRealmBattlePrompt = "For this trial, Raaru wants you to open the sealed door that now holds the arrows.\n1. "
			+ "Try to use your strength to move the heavy pedestal on to the button in the corner to open the door.\n2. "
			+ "Summon a large boulder with earth magic on top of the button to open the door.\n3. "
			+ "Shoot an arrow at the switch on the ceiling, flooding a foot of water into the room and making the pedestal light\n"
			+ "enough to be moved to the button.\nChoose 1, 2, or 3.";
	static String sacredRealmWin = "You've passed Rauru's trial. You walk up to the pedestal and grab the Light Arrows! On to your next journey!";
	static String templeOfTime = "You've found something in the forest: It's the Ocarina of Time! You play a tune that you remember faintly from your childhood.\n"
			+ "Suddenly you are whisked away through time and end up in the Temple of Time. It's eerily quiet here. \n"
			+ "There are no enemies. Only a long path. This must be the Door of Time that Navi was telling me about.\n"
			+ "But how could I possibly get in? As you step forward, a pressure plate activates the temple,\n and large swinging axes oscillate back and forth along your path.\n";
	static String templeOfTimeBattlePrompt = "You must get through the path safely to the door. \n1. Use your strength and swordsmanship to cut each axe as it swings in front of you.\n"
			+ "2. Stop time using time magic with your staff, allowing you to walk freely to the door.\n3. "
			+ "Use your dexterity and nimbly dodge each axe as it swings, timing your moves carefully to get to the door.";
	static String templeOfTimeWin = "You've made it inside the door! Inside is a small room with many weapon racks. All of them are empty except one. \n"
			+ "A sword rack in the corner with a lone sword resting in it. You walk up to the sword and grab it. \n"
			+ "It hums in your hand and glows, lighting the whole room. In your head you hear an angelic voice say:\n "
			+ "\"It's dangerous to go alone! Take This!\" You recieved the MASTER SWORD";
	static String ganonsCastle = "You travel to Ganon's Castle after acquiring the Triforce, Light Arrows, Master Shield and Master Sword. \n"
			+ "You know you are now strong enough to take on Ganon and save Princess Zelda.\n"
			+ "You travel deep into his castle, dispatching enemies as they appear.\n"
			+ "Finally, you arrive at Ganondorf's throne room.\n"
			+ "Ganondorf proceeds to go on a 20 minute rant about why he is evil and doing evil things. \n"
			+ "You try to press the start button to skip all of the text but a message pops up in the corner. \n"
			+ "\"You Cannot Skip This\"\n"
			+ "Out of the corner of your eye, you see Princess Zelda locked in a cage suspended above lava (for effect, of course). \n"
			+ "You allow him to finish his monologue and charge into battle!";
	static String ganonBattlePrompt = "How will you defeat Ganon? \n1. Rush sword first into the wizard hacking and slashing, attempting to defeat the boss with your strength alone.\n2. Use the Arrows of Light to weaken him, then attack with the Master Sword while defending with the Master Shield. \nFinally, seal him for eternity with the Triforce.\n3. Run away. The princess isn't worth risking your remaining hearts.\nChoose 1, 2, or 3.";
	static String rescueZelda = "You utilize the power hidden in the Master Sword and the Light Arrows to weaken and then defeat Ganon.\n "
			+ "Before he dies, he uses the rest of his power to bring the castle down around him. \n"
			+ "You manage to escape with Princess Zelda and trap Ganon in the Sacred Realm.\n "
			+ "Hyrule will know peace for the first time since you fell into your deep sleep. \n";
	static String battleLose = "You have chosen a strategy that was...less than effective. \nYou narrowly defeat your enemy and escape with your prize. It cost you a heart in the process.";

	public Scene(String sceneSetup, String battlePrompt, String battleResultWin, String battleResultLose) {

		this.setSceneSetup(sceneSetup);
		this.setBattlePrompt(battlePrompt);
		this.setBattleResultWin(battleResultWin);
		this.setBattleResultLose(battleResultLose);

	}

	public String getBattlePrompt() {
		return battlePrompt;
	}

	public void setBattlePrompt(String battlePrompt) {
		this.battlePrompt = battlePrompt;
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

		return 0;
	}

}
