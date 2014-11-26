import java.util.*;
import java.io.*;
/**
 * Creates a word search puzzle
paired with Leon Cheng
all good so far!!
 *
 */
public class WordSearch{
    
    Random r  =  new Random();
    private char[][] board;
    
    public WordSearch(int r, int c){
	board = new char[r][c];

	words = new ArrayList<String>();

	Scanner sc = null;

	try {
	    sc = Scanner(new FIle("words.text"));}
	catch(exception e) {
	    System.out.println("can't open wordlist");
	    System.exit(0);
	}
	
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
		s = s + board[i][j] +" ";
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public void insert(String w, int row, int col, int rowChange, int colChange){
	if (insertCheck(w,row,col,rowChange,colChange)){
	    for (int i=0;i<w.length();i++){
		board[row][col] = w.charAt(i);
		row += rowChange;
		col += colChange;
	    }
	}	
    }
    
    public boolean insertCheck(String w, int row, int col, int rowChange, int colChange){
	int r = row;
	int c = col;
	boolean ans=true;
	try {
	    for (int i=0;i<w.length();i++){
		ans = ans && (board[r][c]=='.' || board[r][c] == w.charAt(i));
		//	System.out.println("coordinates: "+r+","+c+ans);
		r+=rowChange;
		c+=colChange;
	    }
	}catch (Exception e) {return false;}
	return ans;
    }
    //18c
    public boolean addWord(String w) {
	boolean ans = false;
	int tries  = 0 ;
	while (tries <5){
	    int type = r.nextInt(8);
	    int a = r.nextInt(board.length);
	    int b = r.nextInt(board[0].length);
	    if (type == 0 && (!(ans))&& ( insertCheck(w , a , b , 0 , 1))   ){
		insert(w , a , b , 0 , 1);
		ans = true;}

	    else  if (type == 1 && (!(ans))&& ( insertCheck(w , a , b , 0 , -1))    ){
		insert(w , a , b , 0 , -1);
		ans = true;}
	    else if (type == 2&& (!(ans)) && ( insertCheck(w , a , b , 1 , 0))){
		insert(w , a , b , 1 , 0);
		ans = true;}
	    else if (type == 3 && (!(ans)) && ( insertCheck(w , a , b , -1 , 0))){
		insert(w , a , b , -1 ,0);
		ans = true;}
	    else if (type == 4 && (!(ans)) && ( insertCheck(w , a , b , 1 , 1))){
		insert(w , a , b , 1 , 1);
		ans = true;}
	    else if (type == 5 && (!(ans)) && ( insertCheck(w , a , b , -1 , -1))){
		insert(w , a , b , -1 , -1);
		ans = true;}
	    else if (type == 6 && (!(ans)) && ( insertCheck(w , a , b , -1 , 1))){
		insert(w , a , b ,-1 , 1);
		ans = true;}
	    else if (type == 7 && (!(ans))&& ( insertCheck(w , a , b , 1 , -1))){
		insert(w , a , b , 1 , -1);
		ans = true;}
	    tries++;
	}
	//if (tries == 6) {return false;}
	//return true;
	return ans;
    }
    
public void fillBoard(){
    Random rnd = new Random();
    String alphabet = "qwertyuiopasdfghjklzxcvbnm";
    for (int i=0;i<board.length;i++){
	for (int j=0;j<board[i].length;j++){
	    if (board[i][j]=='.'){
		board[i][j] = alphabet.charAt( rnd.nextInt(alphabet.length()) );
	    }
	}
    }
    //System.out.println(alphabet);
}

    public void buildPuzzle(int numwords) {
	/*loop, take random word out of wordlist, try to add to puzzle*/ 
	

    }
			   
    // /* with _F it means in the forward word direction/orientation */
    // public boolean canAdd_F(String w , int row, int col) {
    // 	boolean ans = true; 
    // 	int x = row;
    // 	int y = col;
    // 	try{
    // 	    for(int i =0;i<w.length();i++) {
    // 		ans = (ans && ( (board[x][y] == '.')||( board[x][y]==w.charAt(i) )  )    );
    // 		y++;
    // 	    }
	    

    // 	    return ans;}
	
    // 	catch(Exception e) {return false;}
    // }
    // public void addWordH_F(String w,int row, int col){
    // 	int r = row, c = col;
    // 	if (  (canAdd_F(w,row,col)) ) {
    // 	    for (int i=0;i<w.length();i++){
    // 		board[r][c] = w.charAt(i);
    // 		c++;
    // 	    }
    // 	}
    // }
    
    //     /* with _B it means in the backward word direction/orientation */

    // public boolean canAdd_B(String w , int row, int col) {
    // 	boolean ans = true; 
    // 	int x = row;
    // 	int y = col;
    // 	try{
    // 	    for(int i =0;i<w.length();i++) {
    // 		ans = (ans && ( (board[x][y] == '.')||( board[x][y]==w.charAt(i) )  )    );
    // 		y--;
    // 	    }
	    

    // 	    return ans;}
	
    // 	catch(Exception e) {return false;}
    // }
    // public void addWordH_B(String w,int row, int col){
    // 	int r = row, c = col;
    // 	if (  (canAdd_F(w,row,col)) ) {
    // 	    for (int i=0;i<w.length();i++){
    // 		board[r][c] = w.charAt(i);
    // 		c--;
    // 	    }
    // 	}
    // }

    // ///18b____________________________________________________________
    // ///_D is adding it downward
    // public boolean canAdd_D(String w , int row, int col) {
	
    // 	boolean ans = true; 
    // 	int x = row;
    // 	int y = col;
    // 	try{
    // 	    for(int i =0;i<w.length();i++) {
    // 		ans = (ans && ( (board[x][y] == '.')||( board[x][y]==w.charAt(i) )  )    );
    // 		x++;
    // 	    }
	    

    // 	    return ans;}
	
    // 	catch(Exception e) {return false;}
    // }
    // public void addWordV_D(String w,int row, int col){
    // 	int r = row, c = col;
    // 	if (  (canAdd_F(w,row,col)) ) {
    // 	    for (int i=0;i<w.length();i++){
    // 		board[r][c] = w.charAt(i);
    // 		r++;
    // 	    }
    // 	}
    // }
 

    // //_U is adding it upwards_______________________________________
    // public boolean canAdd_U(String w, int row, int col) {
    // 	boolean ans = true; 
    // 	int x = row;
    // 	int y = col;
    // 	try{
    // 	    for(int i =0;i<w.length();i++) {
    // 		ans = (ans && ( (board[x][y] == '.')||( board[x][y]==w.charAt(i) )  )    );
    // 		x--;
    // 	    }
	    

    // 	    return ans;}
	
    // 	catch(Exception e) {return false;}
    // }
    // public void addWordV_U(String w,int row, int col){
    // 	int r = row, c = col;
    // 	if (  (canAdd_F(w,row,col)) ) {
    // 	    for (int i=0;i<w.length();i++){
    // 		board[r][c] = w.charAt(i);
    // 		r--;
    // 	    }
    // 	}
    // }
 

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	System.out.println("before------");

	w.insert("bar" , 10,22,1,1);
	w.insert("bar", 15,22,1,-1);
	w.insert("bar",15,22,1,1);
	w.insert("bar",15,22,-1,0);
	w.insert("bar",15,22,0,-1);
	w.insert("friday",12,2,1,1);
	w.insert("porpoise",8,0,1,0);
	w.insert("porpoise",9,0,1,0);
	w.insert("plum",9,0,-1,0);
	w.insert("plum",8,20,0,-1);
	w.insert("racecar",8,7,0,1);
	w.insert("smash",2,1,0,1);
	w.insert("brothers",2,6,0,1);
	System.out.println(w.addWord("random"));
	System.out.println(w);
	w.fillBoard();
	System.out.println();
	System.out.println(w);

    }
}
