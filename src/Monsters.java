//Serena Havunen
//2/15/21
//Professor.Uche 

import java.util.Random;

public class Monsters {
//defines monster class 
	private double health;
	private double strength;

	public Monsters(double health, double strength) {
		this.health = health;
		this.strength = strength;
//sets the strength and health of each individual monster 
	}

	public double gethealth() {
		return health;
	}

	public double getstrength() {
		return strength;
	}

	public void sethealth(double health) {
		this.health = health;
	}

	public void setstrength(double strength) {
		this.strength = strength;
	}

	public boolean isAlive() {
		if (health > 0) {
			return true;
		} else
			return false;
//Shows the monster is alive if the health is greater than 0
	}


	public double attack() {
		double num = Math.random() * strength; //Math.random gives random number between 0 and 1, I multiplied it by strength 
		return num; 
	}

	public void takeDamage(double damage) {
		this.health = health - damage; //subtracts the damage from each individual monsters health 
	}

}
