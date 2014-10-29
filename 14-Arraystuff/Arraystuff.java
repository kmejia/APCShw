import java.util.*;

public class Arraystuff {
    private int[] a;
    private Random rnd;
    public final int final_example = 123;
    //by making a var fianl we can't change its vale after initial assignment

    //constructors
    public Arraystuff(int n) {
	a =new int[n];
	for (int i =0;i<a.length;i++) {
	    a[i] = 75 + rnd.nextInt(76);
	}
    }
    public Arraystuff() {
	this(100);
    }
    //methods ------------------------------------------------
    
    public String toString() {
	String s = "";
	for (int i = 0 ;i < a.length;i++) {
	    s = s+ a[i] +"";
	} 
	return s;
    }
    ////hw-------------------------------------------------/-////
    public int find(int value) {
	//Arraystuff a = new Arraystuff();
	for (int i = 0;i<a.length;i++) {
	    if (value==a[i]){
	    return i;
	    }
	}
	return -1;
    }
    public int MaxVal() {
	//Arraystuff a = new Arraystuff();

	if (a.length==1) {return a[0];}
	int maxs = a[0];
	for (int i = 0 ;i<a.length;i++) {
	    if (a[i] > maxs) {
		maxs = a[i];
	    }

	}
	return maxs;
	

    }	



    //HW14b-------------------------------------------////////////////////    
    


    public int sum67(int[] nums) {
	int i;
	int ans = 0;
	for (i = 0; i <nums.length; i++) {
	    if (nums[i]!=6) {ans = ans + nums[i];}
	    if (nums[i]==6) {
		while (nums[i]!=7) {
		    i = i +1;
		    ans =  ans + 0;
		}
	    }
	    
	    
	    
	    
	}
	return ans;
    }
    

    public boolean more14(int[] nums) {
	int onenum = 0;
	int fournum = 0;
	for (int i = 0;i<nums.length;i++) {
	    if (nums[i]==1) {onenum+=1;}
	    if (nums[i] ==4) {fournum+=1;} 
	    
	}
	return onenum>fournum;
	
    }
    


   

    
    public boolean tripleUp(int[] nums) {
	int[] ans = new int[3];
	if (nums.length==3) {return (nums[0]==nums[1]-1 && nums[0]==nums[2]-2);}
	for (int i = 0; i< nums.length-2;i++) {
	    ans[0] = nums[i];              
	    ans[1] = nums[i+1];
	    
	    ans[2] = nums[i+2];
	    if (ans[0]==ans[1]-1 && ans[0]==ans[2]-2) {return true;}
	}
	return false;
    }
    //2 helpers for the below fxn
    public int sumFront(int[] nums , int i) {
	int ans = 0;
	if (i==0) {return nums[i];}
	else{ for (int place = 0 ; place<=i;place++) {
		ans +=nums[place];                              
	    }       
	} 
	return ans;                  
    }
    public int sumBack(int[] nums , int i) {
	int ans = 0;
	if (i == nums.length-1) {return nums[i];}
	else { for (int place = i+1; place<nums.length;place++)
		ans +=nums[place];
	}
	return ans;
    }
    
    public boolean canBalance(int[] nums) {
	if (nums.length==1) {return false;}
	for (int i = 0;i<nums.length;i++) {
	    if (sumFront( nums , i)==sumBack( nums ,  i)) {
		return true;
	    }
	    
	}
	return false;
    }
    
    
    

    
    public static void main(String[] args) {
	//this is perfectly fine, making an instance within itself
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	//give it a main to test if it works

	System.out.println(as.find(24));

	System.out.println(as.MaxVal());
	
    }
}
