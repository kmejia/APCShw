import java.util.*;

public class Arraystuff {
    private int[] a;
    private Random rnd;
    public final int final_example = 123;
    //by making a var fianl we can't change its vale after initial assignment

    //constructors
    public Arraystuff(int n) {
	a =new int[n];
	for (int i =0;i<a.length;i++) {
	    a[i] = 75 + rnd.nextInt(76);
	}
    }
    public Arraystuff() {
	this(100);
    }
    
    
    public String toString() {
	String s = ""+a.length;
	for (int i = 0 ;i < a.length;i++) {
	    s = s+ a[i] +"";
	} 
	return s;
    }
    ////hw-------------------------------------------------/-////
    public int find(int value) {
	for (int i = 0;
	return -1;


    }



    
    
    public static void main(String[] args) {
	//this is perfectly fine, making an instance within itself
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	//give it a main to test if it works
    }
}
