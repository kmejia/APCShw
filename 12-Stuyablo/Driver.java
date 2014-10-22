import java.util.*;
public class Driver {
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	String character;
	String newname;
	String attackmethod;
	System.out.println();
	System.out.println("Welcome to Stuyablo!");
	System.out.println();
	System.out.println("What class do you want to be?");
	System.out.println("If left blank, you will be defaulted to WARRIOR.");
	System.out.println("-> Warrior");
	System.out.println("-> Mage");
	System.out.println("-> Rogue");
	character = scanner.nextLine();
	System.out.println();
	System.out.println("What is your name?");
	System.out.println("If left blank, you will be defaulted to MIKE.");
        newname = scanner.nextLine();
	if (newname.equals("")) {
	    newname = "MIKE";
	}
	if (character.equals("")){
	    character = "warrior";
	}
	System.out.println();
	
	character = character.toLowerCase();
	newname = newname.toUpperCase();

	if (character.equals("warrior")) {
	    warrior p1 = new warrior(newname);
	    String parsing[] = { "Your adventure begins now!...", "...","... ", "...", "..." };
	    String parsing2[] = { "...", "...", "...", "...", "....!!" };
	    String parsing3[] = { "...", "...", "...", "..." };
	    try {
		for (int i=0;i<parsing.length;i++){
		    Thread.sleep(500);
		    System.out.println(parsing[i]);
		}
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }

	    monster enemy = new monster();
	    System.out.println();
	    System.out.println("You are a "+character.toLowerCase()+" named "+newname.toUpperCase()+".");
	    System.out.println("You walk slowly through the abandoned castle, your mace dragging along the floor.");
	    try { Thread.sleep(1000); } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    try {
		for (int i=0;i<parsing.length;i++){
		    Thread.sleep(500);
		    System.out.println(parsing2[i]);
		}
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    String warriorMethods[] = {"->BASH","->BLOCK"};
	    System.out.println("You encountered an "+enemy.getName().toUpperCase()+"!");
	    System.out.println();
	    System.out.println("What do you want to do?");
	    System.out.println("You can:");

	    try {
		for (int i=0;i<warriorMethods.length;i++){
		    Thread.sleep(500);
		    System.out.println(warriorMethods[i]);
		}
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    attackmethod = scanner.nextLine();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    if (attackmethod.toUpperCase().equals("BASH")) {
		p1.bash(enemy);
	    } else if (attackmethod.toUpperCase().equals("BLOCK")) {
		p1.block(enemy);
	    }
	    try {
		for (int i=0;i<parsing3.length;i++){
		    Thread.sleep(500);
		    System.out.println(parsing3[i]);
		}
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    System.out.println();
	    System.out.println("ORC HEALTH: "+enemy.getHealth());
	    System.out.println(p1.getName()+"'s HEALTH: "+p1.getHealth());
	    




	} else if (character.equals("mage")) {
	    mage p1 = new mage(newname);
	    String parsing[] = { "Your adventure begins now!...", "...","... ", "...", "..." };
	    String parsing2[] = { "...", "...", "...", "...", "....!!" };
	    String parsing3[] = { "...", "...", "...", "..." };
	    try {
		for (int i=0;i<parsing.length;i++){
		    Thread.sleep(500);
		    System.out.println(parsing[i]);
		}
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }

	    monster enemy = new monster();
	    System.out.println();
	    System.out.println("You are a "+character.toLowerCase()+" named "+newname.toUpperCase()+".");
	    System.out.println("You have a firm grip on your wand as you advance through the labryinth.");
	    try { Thread.sleep(1000); } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    try {
		for (int i=0;i<parsing.length;i++){
		    Thread.sleep(500);
		    System.out.println(parsing2[i]);
		}
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    String mageMethods[] = {"->FIRESPELL","->HEAL"};
	    System.out.println("You encountered an "+enemy.getName().toUpperCase()+"!");
	    System.out.println();
	    System.out.println("What do you want to do?");
	    System.out.println("You can:");

	    try {
		for (int i=0;i<mageMethods.length;i++){
		    Thread.sleep(500);
		    System.out.println(mageMethods[i]);
		}
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    attackmethod = scanner.nextLine();
	    if (attackmethod.toUpperCase().equals("FIRESPELL")) {
		p1.firespell(enemy);
	    } else if (attackmethod.toUpperCase().equals("HEAL")) {
		p1.heal(enemy);
	    }
	    try {
		for (int i=0;i<parsing3.length;i++){
		    Thread.sleep(500);
		    System.out.println(parsing3[i]);
		}
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    System.out.println();
	    System.out.println("ORC HEALTH: "+enemy.getHealth());
	    System.out.println(p1.getName()+"'s HEALTH: "+p1.getHealth());
	    



	} else if (character.equals("rogue")) {
	    rogue p1 = new rogue(newname);
	    String parsing[] = { "Your adventure begins now!...", "...","... ", "...", "..." };
	    String parsing2[] = { "...", "...", "...", "...", "....!!" };
	    String parsing3[] = { "...", "...", "...", "..." };
	    try {
		for (int i=0;i<parsing.length;i++){
		    Thread.sleep(500);
		    System.out.println(parsing[i]);
		}
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }

	    monster enemy = new monster();
	    System.out.println();
	    System.out.println("You are a "+character.toLowerCase()+" named "+newname.toUpperCase()+".");
	    System.out.println("You walk through the forest with your dagger up your sleeve.");
	    try { Thread.sleep(1000); } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    try {
		for (int i=0;i<parsing.length;i++){
		    Thread.sleep(500);
		    System.out.println(parsing2[i]);
		}
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    String rogueMethods[] = {"->SLASH","->DODGE"};
	    System.out.println("You encountered an "+enemy.getName().toUpperCase()+"!");
	    System.out.println();
	    System.out.println("What do you want to do?");
	    System.out.println("You can:");

	    try {
		for (int i=0;i<rogueMethods.length;i++){
		    Thread.sleep(500);
		    System.out.println(rogueMethods[i]);
		}
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    attackmethod = scanner.nextLine();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    if (attackmethod.toUpperCase().equals("SLASH")) {
		p1.slash(enemy);
	    } else if (attackmethod.toUpperCase().equals("DODGE")) {
		p1.dodge(enemy);
	    }
	    try {
		for (int i=0;i<parsing3.length;i++){
		    Thread.sleep(500);
		    System.out.println(parsing3[i]);
		}
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    System.out.println();
	    System.out.println("ORC HEALTH: "+enemy.getHealth());
	    System.out.println(p1.getName()+"'s HEALTH: "+p1.getHealth());

	    
	} else if (character.equals("")) {
	    	    
	}


	    

    }
}
