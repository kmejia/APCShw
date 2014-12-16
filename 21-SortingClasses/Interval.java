import java.util.*;
import java.io.*;
public class Interval {
    private int low;
    private int high;
    private static Random r = new Random();
    private static int numIntervals = 0;
    public Interval() {
        
	boolean check = false;
	low  = r.nextInt(100);
	while (check ==false) {
	    int x = r.nextInt(100);
	    if  (x>=low){
		high = x+1;
		check = true;
	    }
	}
       
    }	
    public Interval( int l , int h) {
	low = l;
	high = h;
    }
    public String toString() {
	return " [ "+low + "," + high + " ] ";
	
    }
    //HW21-----------------------------///////////
    public int getHigh() {return high;}
    public int getLow(){return low;}
    
    public int compareTo(Interval other) {
	if (this.getLow()==other.getLow()) {
	    return this.getHigh() - other.getHigh();
	}
	else{
	    return this.getLow() - other.getLow();
	}
    }

    public static void main(String[] args) {
	Interval k = new Interval();
	System.out.println("k equals "+k);
	Interval w = new Interval();
	System.out.println("w equals "+w);
	Interval[] lists = new Interval[10];
	for (int i = 0; i < lists.length ;i++) {
	    lists[i] = new Interval();
	}
        
       	//System.out.println(Arrays.toString(lists));
	System.out.println("their comparison is "+k.compareTo(w));
    }
} 

