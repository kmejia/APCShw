public class basechar {
    private int health;
    private int strength;
    private int defense;
    private int speed
    private String name;

    public void setSpeed (int s){
	speed = s;
    }
	
    public void setHealth(int h){
	health=h;
    }
    public int getHealth(){
	return health;
    }
    public void setStrength(int s){
	strength=s;
    }
    public int getStrength(){
	return strength;
    }
    public void setName(String n){
	name = n;
    }

    public void pause(int t){
	try {
	    Thread.sleep(t);
	} catch (Exception e) {}
    }
}
