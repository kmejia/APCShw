

public class Shapes2 {
    public String line (String ch, int n) {
	String ans = "";
	int x = n;
	while (x > 0) {
	    ans = ans + ch;
	    x = x - 1;
	}
	return ans;
    }


    public String frame(int r , int c) {
	int row = r;
	String ans = "";
	int spaces = c - 2;
	for(row = 1; row <= r; row = row + 1) {
	    if (row==1 || row == r) {
		ans = ans + line("*", c);
	    }
	    else if (1 < row && row < r) {
		ans = ans + "*" + line(" " , spaces) + "*";
	    }
	    ans +="\n";
	    /// row = row+1; not needed
	}
	return ans;
    }
    
    //codingbat
    public String stringSplosion(String str) {
	String ans = "";
	int place;
	for (place = 1 ; place <= str.length(); place = place + 1 ) {
	    ans = ans + str.substring(0 , place);
	}
	
	return ans;
    }
    
    public String stringX(String str) {
	String ans = "";
	int place ;
	for (place = 0; place < str.length(); place = place + 1) {
	    if (place != 0 && place != str.length() && 
		!(str.substring(place, place + 1).equals("x"))   ) {
		ans = ans + str.substring(place, place + 1);    
		
	    }
	    return ans;
	}
    }


}
