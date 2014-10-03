

public class Shapes2 {
    public String line (String ch, int n) {
	String ans = "";
	int x = n;
	while (x > 0) {
	    ans = ans + ch;
	}
	return ans;
    }


    public Sring frame(int r , int c) {
	//int row = r;
	int spaces = c - 2;
	for(row = 1; row <= r; row = row + 1) {
	    if (row==1 || row == r) {
		ans = ans + line("*", c);
	    }
	    if else {
		ans = ans + "*" + line(" " , spaces) + "*";
	    }
	    ans +="\n";
	    row = row+1;
	}
    	   
    }

}
