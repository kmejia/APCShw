import java.io.*;
import  java.util.*;

public class AList {
    Random r = new Random();
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    public void createAL() {
	for (int i = 0;i<20;i++) {
	    a1.add(r.nextInt(10));
	}
    }
    public void remDuplicates() {
	for (int i = 0 ; i <a1.size()- 1;i++){
	    if (a1.get(i)==a1.get(i+1)) {a1.remove(i+1);}

	}
    }
    public static void main(String[] args){
	AList k = new AList();
	k.createAL();
	System.out.println("before removal....");
	System.out.println(k.a1);
	System.out.println();
	k.remDuplicates();
	System.out.println("after removal");
	System.out.println(k.a1);

    }

}
    
