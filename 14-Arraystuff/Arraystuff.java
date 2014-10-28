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
    //methods ------------------------------------------------
    
    public String toString() {
	String s = "";
	for (int i = 0 ;i < a.length;i++) {
	    s = s+ a[i] +"";
	} 
	return s;
    }
    ////hw-------------------------------------------------/-////
    public int find(int value) {
	Arraystuff a = new Arraystuff();
	for (int i = 0;i<a.length;i++) {
	    if (value.equals(a[i])){
	    return i;
	    }
	}
	return -1;
    }
    public int MaxVal() {
	Arraystuff a = new Arraystuff();

	if (as.length==1) {return "no max";}
	int maxs = as[0];
	for (int i = 0 ;i<a.length;i++) {
	    if (a[i] > maxs) {
		maxs = a[i];
	    }

	}
	return maxs;
	

    }	



    
    
    public static void main(String[] args) {
	//this is perfectly fine, making an instance within itself
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	//give it a main to test if it works

	System.out.println(as.find(24));

	System.out.println(as.MaxVal());
	
    }
}
