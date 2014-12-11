import java.util.*;
import java.io.*;

public class monster implements Comparable {
    Random r = new Random();
    private int health;
    private int strength;
    private int defense;
    private int speed;
    private int mana;      
    private boolean defending;
    private int attackStrength;
    private String name;
    public String getName(){
	return name;
    }
    public monster() {
        setHealth(120 + r.nextInt(20));
        setStrength(80 + r.nextInt(20));
        setSpeed(45 + r.nextInt(20));
        setMana(80 + r.nextInt(20));
	String[] n ={"Orc","blah","skeleton","devil", "the DMV","kevin","dwarf","hobbit", "bowser", "ridley"};
        setName(n.nextInt( 10 ));
    }
    public monster(String n ) {
        setHealth(120 + r.nextInt(20));
        setStrength(80 + r.nextInt(20));
        setSpeed(45 + r.nextInt(20));
        setMana(80 + r.nextInt(20));

        setName(n);
    }


    public void evilattack(monster other) {
        this.setAttackStrength(this.getStrength()/10- r.nextInt(20));
        //other.setHealth(other.getHealth() - damage);
        System.out.println(this + "EvilAtacked"+other);
        //System.out.println(other +"lost"+damage+"damage!!");
        other.setDefending(true);
    }
    public void darkmagic(monster other) {
        this.setAttackStrength(this.getStrength()/10- r.nextInt(20));
        //this.setManna(this.getManna() / 2);
        //other.setHealth(other.getHealth() - damage);
        System.out.println(this + "used DARKMAGIC on"+other);
        //System.out.println(other +"lost"+damage+"damage!!");
        other.setDefending(true);
    }
    public void dodge(monster other) {
	
	
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
    public int compareTo(Object other) {
	monster k = (monster)other;
	return this.getName().compareTo(k.getName());
    }
    public String toString() {
	String ans = "";
	for (int j = 0; j<L.size();j++){
	    ans += L.get(j);
	}
	return ans;
    }
 

    public static void main(String[] args) {
	ArrayList<monster> L = new ArrayList<monster>();
	int i = 0;
	while (i<10){
	    L.add(new monster()); 
	}
	System.out.println(L);
	Collections.sort(L);
	System.out.println(L);
    }
   
}
