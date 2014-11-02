import java.util.*;
import java.io.*;
public class APtest1 {

    Random r = new Random();
    public String scrambleWord(String word) {
	String ans =  "";
	String[] words = word.split("");
	for(int i=0;i<words.length;i++) {
	    if (i+1<word.length() && r.nextInt(2)==0) {
		ans+= words[i+1];
		ans+= words[i];
		
		i+=1;
		
	    }
	    else {
		ans+= words[i];
	    }
 	    
	}
	return ans;
    }
    
    
    
    public static void main(String[] args) {
	
	APtest1 k = new APtest1();
	System.out.println(k.scrambleWord("TAN"));
	System.out.println(k.scrambleWord("WHOA"));
	System.out.println(k.scrambleWord("A"));
	System.out.println(k.scrambleWord("EGGS"));
    }
    
    
    
}
