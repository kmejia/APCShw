import java.util.*;
public class Arrays {
    public int[] frontPiece(int[] nums) {
	
	if (nums.length > 2){
	    return Arrays.copyOfRange(nums 0 , 2);
	} 
	else {return nums;}
	
    }
    public int sum13(int[] nums) {
	int ans = 0;
	
	for ( int i=0;i<nums.length;i++) {
	    if (nums[i]==13) {
		if (i +2<nums.length){i+=2;}
		else {return ans;}
		
	    }
	    if (nums[i]!=13) {
		ans = ans + nums[i];
	    }
	}
	return ans;
    }
    
}
