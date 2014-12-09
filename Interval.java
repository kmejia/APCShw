import java.util.*;
import java.io.*;
public class Interval {
    int low;
    int high;
    public Interval() {
        
	boolean check = false;
	Random r = new Random();
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
    

    public static void main(String[] args) {
	Interval k = new Interval();
	System.out.println(k);
	Interval[] lists = new Interval[10];
	for (int i = 0; i < 20 ;i++) {
	    lists[i] = new Interval();
	}
	System.
	System.out.println(Arrays.toString(lists);
    }
} 

