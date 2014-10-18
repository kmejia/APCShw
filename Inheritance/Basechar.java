/* superclass of Warrior and Mage */
public class Basechar {
    private int health=20;
<<<<<<< HEAD
    private String name="default name";

    public String toString(){
	return this.getName();
    }
    public void attack(Basechar other){
	//System.out.println(this.getName()+" is attacking "+other.getName());
	// toString is automatically called when you put a class instance in a string
	// context
	System.out.println(this+" is attacking "+other);
    }

    //constructor of basecar
    public Basechar() {
	name = "default";
    }
		       
    public void setName(String name) {
	this.name = name;
    }
    public String getName(){
	return name;
    }
=======
    private String name ="default";
    //constructor
    public Basechar(String n) {
	setName(n) ;
	    }

    //
    public String toString() {
	return this.getName();
	    }
    public void attack(Basechar other); {
	System.put.println(this.getName() + " is attacking "+ other.getname());
    }


    
    public void setName(String name) {
	this.name = name;
    }
    public String getName() {
	return name ;
	    }
>>>>>>> b753c631054fe780cdeeac3bcb164ffb28538210
    public int getHealth() {
	return health;
    }

    public void setHealth(int i){
	health = i;
    }
}


