import java.io.*;
import java.util.*;

public class Searching  {
    //constructors
    Random r = new  Random();
    public Comparable[] a;
    public  Comparable copy;
    Searching(int n) { 
	Comparable[] a =new Comparable[n];
    }
    Searching() {
	this(30);
    }
    public int compareTo(Object item) {
	return this.compareTo(item);
    }
    public void fill() {
	for (int i = 0 ; i<a.length;i++) {
	    additem(r.nextInt(100) , i);
	}
    }
    public void additem(Comparable x, int  ind) {
	a[ind] = x;
    }
    public String toString() {
	String ans = "";
	for (int i = 0 ; i <a.length;i++) {
	    ans = ans + " "+a[i];
	}return ans;
    }
    public Comparable lsearch(Comparable item) {
	for (int i = 0;i<a.length;i++) {
	    if (a[i].equals(item)){return i;}
	}
	return null;
    }
    
   public Comparable bsearch(Comparable item) {
       int l=0; 
       int h = a.length - 1;
       int mid =(l+h)/2;
       while (l< h) {
	   if (a[mid].compareTo(item)==0) {
	       return item;
	   }
	   else {
	       if (item.compareTo(a[mid]) < 0) {
		   h = mid - 1;
	       }
	       else {
		    l = mid + 1;
	       }
	       
	   }
	   mid = (l+h)/2;
       }
       return null;
   }


    public Comparable rbsearch(int l , int h , Comparable item) {
	int mid = (l+h)/2;
	if (l< h) {
	    if (a[mid].compareTo(item)==0) {
		return item;
	    } else {
		if (item.compareTo(a[mid]) > 0) {
		    return rbsearch(mid +1 , h, item);
		} else {
		    return rbsearch(l,mid - 1, item);
		}
	    }
	}
	
	return null;
	
    }


    public static void main(String[] args) {
	Searching k = new Searching();
	Arrays.sort(k.a);
	long startT = System.nanoTime();

	//    k.lsearch();
	//k.bsearch();
	//k.rbsearch();
	long endT = System.nanoTime();
	System.out.println("search time = " + (double)( endT - startT));
	Arrays.sort(k.a);//some cases where linear is fastest
	System.out.println(k.a);
    }


}
