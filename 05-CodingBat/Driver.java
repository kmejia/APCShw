public class Driver {
    public static void main(String[] args){
	StringStuff k = new StringStuff();
	// k is a new mamber of the class Stringstuff, it can call 
	//any of its methods
	//	System.out.println(nonStart("hello" , "world"));
	System.out.println("We will now use methods nonStart, diff21, and makeAbba");
	
	
	System.out.println("k.nonStart(hello , world) ==>"+k.nonStart("hello" , "world"));
	System.out.println("k.diff21(74) ==>"+k.diff21(74));
	System.out.println("k.makeAbba(aaaa,bbbb) ==> "+k.makeAbba("aaaa" , "bbbb"));
    }
}
