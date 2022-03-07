//Serena Havunen
//2/15/21
//Professor.Uche

import java.util.Random;
//defines battle class 
public class Battle {
	public static void main(String[] args) {
//create two new monsters with the characteristics from the Monsters class 
		Monsters ogre = new Monsters(60, 25);
		Monsters giant = new Monsters(100, 15);
		
		int count =0; 
//starts battle, not stopping till ones health is less than 0
while ((ogre.gethealth()>0) && (giant.gethealth()>0)) {
	
	double attack1 = ogre.attack(); 
	giant.takeDamage(attack1); 
	
	double attack2 = giant.attack(); 
	ogre.takeDamage(attack2); 
	
	count++; //this function increases the battle by 1 everytime the loop runs 
	
	System.out.println(count+ "." +"Giant Health: " + giant.gethealth() + "\tOgre Health: " +  ogre.gethealth());
//if statements to determine who won or if there is a tie 
}

if (giant.isAlive()) {	
	System.out.println("GIANT has won"); 
	} else if (ogre.isAlive()) {	
	System.out.println("OGRE has won"); 
	}else {
		System.out.println("Tie");
	}

}
	
}	
		