//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _07_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	public static void main(String[] args) {
		for(int i=0; i<10L;i++) {
		/* 1. Ask the user which animal they want, then play the sound of that animal. */			 
		 String j =JOptionPane.showInputDialog("What animal would you like? (Llama, Cat, Cow, Duck, and Dog.)");
		/* 2. Make it so that the user can keep entering new animals. */

	
if (j.equals("Cow")) {
playMoo();
}else if(j.equals("Duck")) {
playQuack();

}else if(j.equals("Dog")) {
	playWoof();
}else if(j.equals("Cat")) {
	playMeow();
}else if(j.equals("Llama")) {
	playLlama();
}
		}

	}
	static void playMoo() {
		playNoise(mooFile);
	}

	static void playQuack() {
		playNoise(quackFile);
	}

	static void playWoof() {
		playNoise(woofFile);
	}
	
	static void playMeow() {
		playNoise(meowFile);
	}
	
	static void playLlama() {
		playNoise(llamaFile);
	}

	static String quackFile = "quack.wav";
	static String mooFile = "moo.wav";
	static String woofFile = "woof.wav";
	static String meowFile = "meow.wav";
	static String llamaFile = "llama.wav";

	/* Ignore this stuff */
	
	public static void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(AnimalFarm.class.getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}