import java.util.*;
import java.io.*;

public class StringStuff {

    public String nonStart(String a, String b) {
	return a.substring(1)+b.substring(1);
    }




    public int diff21(int n) {
	if (n < 21) 
	    return Math.abs(n - 21);
	return Math.abs((21 - n) * 2);
    }


    public String makeAbba(String a, String b) {
	return a+b+b+a;
    }
}
  
