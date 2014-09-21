import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
        String s="Kevin Mejia";
        // you'll add code here
	int space = s.indexOf(" ");
	String firstname = s.substring(0 , space);
	String lastname = s.substring(space);
	System.out.println("First name is " + firstname);
	System.out.println("Last name is " + lastname);
	
    }
}
