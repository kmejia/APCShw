import java.util.*;
import java.io.*;

public class monster extends basechar { 
    Random r = new Random(); 

    public monster() { 
	setHealth(120 + r.nextInt(20));
	setStrength(80 + r.nextInt(20));
	setSpeed(45 + r.nextInt(20));
	setMana(80 + r.nextInt(20));
        
	setName("Orc");
    }
    public monster(String n ) {
	setHealth(120 + r.nextInt(20));
	setStrength(80 + r.nextInt(20));
	setSpeed(45 + r.nextInt(20));
	setMana(80 + r.nextInt(20));

	setName(n);
    }
   
	
    public void evilattack(basechar other) {
	this.setAttackStrength(this.getStrength()/10- r.nextInt(20));
	//other.setHealth(other.getHealth() - damage);
	System.out.println(this + "EvilAtacked"+other);
	//System.out.println(other +"lost"+damage+"damage!!");
	other.setDefending(true);
    } 
    public void darkmagic(basechar other) {
	this.setAttackStrength(this.getStrength()/10- r.nextInt(20));
	//this.setManna(this.getManna() / 2);
	//other.setHealth(other.getHealth() - damage);
	System.out.println(this + "used DARKMAGIC on"+other);
	//System.out.println(other +"lost"+damage+"damage!!");
	other.setDefending(true);
	    }
    public void dodge(basechar other) {
	
   
	System.out.println(this.getName() + " DODGES AGAINST " + other + "'s attack");
		other.lowerAttackStrength(this.getStrength()/9 + r.nextInt(20));

	other.lowerAttackStrength(this.getStrength()/9 + r.nextInt(20));
	if (other.getAttackStrength() < 15) {
		System.out.println(this + "was well from harms way!!");
	    }
	if (other.getAttackStrength() > 25) {
		System.out.println(this + "is still vulnerable....");
	    }
	other.assignDamage(this);
	
    }
	
	
}
