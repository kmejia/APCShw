import java.io.*;
import java.util.*;

public class TestPrep {

    Random r = new Random();
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    public void create(int  n) {
	for (int i = 0; i < n+1; i++) {
	    a1.add(i);
	}
    }
    public void randomize() {
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

    public static void main(String[] args) {
	TestPrep k = new TestPrep();
	k.create(6);
	System.out.println(k.a1);
	k.randomize();
	System.out.println(k.a1);

    }
}
