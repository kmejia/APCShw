


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

    //help from eric

    public String tri3( int h ) {
        int rowlength = (2*h) - 1;
	int stars = 1;
	int spaces = (rowlength - 1)/2;
	
	String ans = "";
	

	while (stars < (h+1)) {
	    int spaces2 = spaces;
	    while (spaces2 > 0){
		ans = ans + " ";
		spaces = spaces - 1;
	    }
	    int stars2 = stars;
	    while (stars2 > 0) {
		ans = ans + "*";
		stars2 = stars2 - 1;
	    }
	    int spaces3 = spaces;
	    while (spaces3 > 0) {
		ans = ans + " ";
		spaces3 = spaces3 - 1;
	    }
	    spaces = spaces - 2;
	    stars = stars + 1;
	    ans = ans + "\n";
	}
	return ans;
    }
    
    public String diamond(int h ) {
	int middle = (h - 1) / 2 + 1;
	String ans = "";
	int rows = h;
	int row;
	int spaces;
	int stars;
	String Spaces;
	String stars;
	
	for(row = 1; row < middle ; row +=1) {
	    
	    spaces = middle - 1;
	    
	    for (spaces;spaces > 0 ;spaces-=1) {
		Spaces+=" ";
		
            }
	    for (stars = 1; stars > 0; stars-=1) {
		Stars+="*";
	    }
	    ans = ans + Spaces + Stars + Spaces;
	    Spaces = Spaces.substring(0, Spaces.length()-1);
	    Stars = Stars + "*";
	    ans +="\n";
	    
	}
	ans += Stars;
	for (row = middle; row < h ; row +=1) {
	    
	    
	    Stars = Stars.substring(0, Stars.length() - 1);
	    Spaces = Spaces + " ";
	    
	    
	    
	    ans += Spaces + Stars + Spaces+"\n";
	    row +=1;
	    
	    
	}
	return ans;
    }
    
    
    
    
    public String tri4(int h){
	int star;
	int space2;
	int star;
	int star2;
	String ans = "";
	for (star = h; star > 0;star = star -1) {
	    space = h - star;
	    
	    
	    for(space2 = space; space2 > 0;space2-= 1) {
		ans = ans + " ";
	    }
	    

	    for(star2 = star;star2 > 0; star2 = star2 -1){
		ans += "*";
	    }
	    ans += "\n";
	}
	return ans;
    }
    
    
}






