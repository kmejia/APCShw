import java.io.*;
import java.util.*;

public class TestPrep {
    ////araylist
    Random r = new Random();
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    public void create1(int  n) {
	for (int i = 0; i < n+1; i++) {
	    a1.add(i);
	}
    }
    public void randomize1() {
	ArrayList<Integer> ans  = new ArrayList<Integer>();
	ArrayList<Integer> copy = a1;
	int times = a1.size();
	int randIndex;
	    while (times > 0){
		randIndex = r.nextInt(copy.size());
		ans.add(copy.get(randIndex));
		times--;
		copy.remove(randIndex);
	    }
	    a1 = ans;
    }

    //array
    int[] a2 = new int[6];
    public void create2(int n ) {
	a2 = new int[n+1];
	for (int i = 0 ; i < a2.length;i++) {
	    a2[i] = i;
	}
    }
    public void randomize2() {
	int[] ans = new int[a2.length];
	int i = 0;
	while (i < ans.length) {
	    int randIndex = r.nextInt(ans.length);
	    if ( a2[randIndex]!=-1  ){
		ans[i] =a2[randIndex];
		a2[randIndex] = -1;
		i++;
	    }
	    
	}
	a2 = ans;
    }


    public static void main(String[] args) {
	TestPrep k = new TestPrep();
	k.create1(6);
	System.out.println(k.a1);
	k.randomize1();
	System.out.println(k.a1);
	System.out.println("--------------------------------------");
	//array
	k.create2(6);
	System.out.println(k.a2);
	k.randomize2();
	System.out.println(k.a2);
	
    }
}
