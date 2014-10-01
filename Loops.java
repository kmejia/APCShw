public class Loops {
    
	/*int n = 0;
	while (n <=9   ) {
	    System.out.println(n);
	    n = n + 1;
	}*/
    //in class
    public String frontTimes(String str, int n) {
	int x = n;
	String s = "";
	if (str.length() < 3) {
	    while ( x > 0) {
		s = s + str;
		x = x - 1;
	    }
	}
	if (str.length() >= 3) {
	    String str2 = str.substring(0 , 3);
	    while ( x > 0) {
		s = s + str2;
		x = x - 1;
	    }
	}
	return s;

    }
    //8 minutes
    public String stringBits(String str) {
	String ans = "";
	int place = 0;
	while (place < str.length() ) {
	    ans = ans + str.substring(place , place + 1 );
	    place = place + 2;
	}
	return ans;
    }
    //having trouble after 25 minutes
public String stringYak(String str) {
  int place = 0;
  String ans = "";
 
  while (place < str.length()) {
  if ( str.substring(place, place + 1).equals("y") ){
  if ( str.substring(place + 2, place + 3).equals("k") )) {
  place +=3;  
  }
  }
  if ( place < str.length() ){
  ans += str.substring(place, place + 1);
  place +=1;
  }
  }
  return ans;
    //again still trouble after 30 minutes
public int stringMatch(String a, String b) {
  int ans = 0;
  int place = 0;
  while (place < a.length() && place < b.length()) {
  if (place + 2 <a.length() && place +2 <b.length()) {
  if (a.substring(place,place+2).equals(a.substring(place,place+2))) {
  ans += 1;
  }
  }
  place +=1;
  }
  return ans;
}
    
}


