import java.util.*;
import java.io.*;
public class basechar {
    //instance variables, actual values vary for every instance of this class
    private int health;
    private int strength;
    private int defense;
    private int speed;
    private String name;
    private int manna;

    public void setHealth(int h){
	health=h;}
    public int getHealth(){
	return health;}
    public void setStrength(int s){
	strength=s;}
    public int getStrength(){
	return strength;}
    public void setManna(int s){
	manna=s;}
    public int getManna(){
	return manna;}
    
    public String toString(){
	return this.getName();
}
    public void pause(int t){
	try {
	    Thread.sleep(t);
	} catch (Exception e) {}
    }
}
