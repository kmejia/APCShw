/**
 * Creates a word search puzzle
paired with Leon Cheng
all good so far!!
 *
 */
public class WordSearch{
    
    private char[][] board;
    
    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
	
    }
    public WordSearch(){
	this(20,30);
    }
    
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    /* with _F it means in the forward word direction/orientation */
    public boolean canAdd_F(String w , int row, int col) {
	boolean ans = true; 
	int x = row;
	int y = col;
	try{
	    for(int i =0;i<w.length();i++) {
		ans = (ans && ( (board[x][y] == '.')||( board[x][y]==w.charAt(i) )  )    );
		y++;
	    }
	    

	    return ans;}
	
	catch(Exception e) {return false;}
    }
    public void addWordH_F(String w,int row, int col){
	int r = row, c = col;
	if (  (canAdd_F(w,row,col)) ) {
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		c++;
	    }
	}
    }
    
        /* with _B it means in the backward word direction/orientation */

    public boolean canAdd_B(String w , int row, int col) {
	boolean ans = true; 
	int x = row;
	int y = col;
	try{
	    for(int i =0;i<w.length();i++) {
		ans = (ans && ( (board[x][y] == '.')||( board[x][y]==w.charAt(i) )  )    );
		y--;
	    }
	    

	    return ans;}
	
	catch(Exception e) {return false;}
    }
    public void addWordH_B(String w,int row, int col){
	int r = row, c = col;
	if (  (canAdd_F(w,row,col)) ) {
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		c--;
	    }
	}
    }

    ///18b____________________________________________________________
    ///_D is adding it downward
    public boolean canAdd_D(String w , int row, int col) {
	
	boolean ans = true; 
	int x = row;
	int y = col;
	try{
	    for(int i =0;i<w.length();i++) {
		ans = (ans && ( (board[x][y] == '.')||( board[x][y]==w.charAt(i) )  )    );
		x++;
	    }
	    

	    return ans;}
	
	catch(Exception e) {return false;}
    }
    public void addWordV_D(String w,int row, int col){
	int r = row, c = col;
	if (  (canAdd_F(w,row,col)) ) {
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r++;
	    }
	}
    }
 

    //_U is adding it upwards_______________________________________
    public boolean canAdd_U(String w, int row, int col) {
	boolean ans = true; 
	int x = row;
	int y = col;
	try{
	    for(int i =0;i<w.length();i++) {
		ans = (ans && ( (board[x][y] == '.')||( board[x][y]==w.charAt(i) )  )    );
		x--;
	    }
	    

	    return ans;}
	
	catch(Exception e) {return false;}
    }
    public void addWordV_U(String w,int row, int col){
	int r = row, c = col;
	if (  (canAdd_F(w,row,col)) ) {
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r--;
	    }
	}
    }
 

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	System.out.println("before------");
	//forward
	w.addWordH_F("hello",3,5);
	w.addWordH_F("porcupine",9,0);
	w.addWordH_F("smash",2,1);
	w.addWordH_F("brothers",2,6);
	w.addWordH_F("alabama",5,0);
	w.addWordH_F("mammal",5,5);

	w.addWordH_F("look",3,8);//should change nothing
	w.addWordH_F("look",3,5);//is legal because of similar letter placement
	//	not working, out of index... 
	w.addWordH_F("hello",100,5);
	w.addWordH_F("hello",30,555);
	//backward
	w.addWordH_B("hello",0,9);
	w.addWordH_B("racecar",11,20);
	w.addWordH_B("bar" , 11,22);
	//vertical tests
	w.addWordV_U("plank",10,0);
	w.addWordV_D("Stuyvesant",0,19);
	w.addWordV_D("BxSci",0,19);
	w.addWordV_D("wannabe",8,4);
	
	System.out.println(w);
	System.out.println("after--------------");
    }
}
