public class basechar {
    private int health;
    private int strength;
    private int defense;
    private String name;
    public void setHealth(int h){
	health=h;}
    public int getHealth(){
	return health;}
    public void setStrength(int s){
	strength=s;}
    public int getStrength(){
	return strength;}
    public void pause(int t){
	try {
	    Thread.sleep(t);
	} catch (Exception e) {}
    }
}
