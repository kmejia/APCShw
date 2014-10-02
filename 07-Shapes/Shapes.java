


public class Shapes {

    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }
    public String tri1(int h) {
	int x = h;
	String rows = "";
	String prev = "";
	while (x > 0) {
	    prev = prev + "*";
	    rows = rows + prev + "\n";
	    x = x - 1;
	    //we use the previous string, add 1 * , and the new line breaker   
	}
	return rows;
    }
     public String tri2(int h) {
	int c1 = 0;
	int c2 = 0;
	int c3 = 0;
	String ans ="";
	while (c1 < h) {
	    c1+=1;
	    c2 = h - c1;
	    c3 = h - 2;
	    while (c2 > 0) {
		ans+=" ";
		c2-=1;
	    }
	    while(c3 > 0) {
		ans+="*";
	    c3-=1;}
	ans+="\n";
     }  
	return ans;
     }
}


