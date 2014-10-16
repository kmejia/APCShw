/* subclass of Basechar */
public class Warrior extends Basechar{
    private int healthboost=5;
    //constructor
    public Warrior(String n) {
	setName(n);
    }
    //
    public void attack(Basechar other) {
	System.out.println(this.getName()+" is super attacking "+other.getName())
    
      public int getHealth() {
	  return healthboost + super.getHealth();
    }

}
