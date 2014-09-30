public class Driver {
    public static void main(String[] args) {
	/*int n = 0;
	while (n <=9   ) {
	    System.out.println(n);
	    n = n + 1;
	}*/
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

    }
}
