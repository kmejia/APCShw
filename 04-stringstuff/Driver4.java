public boolean mixStart(String str) { 
    if (str.length() < 3) 
      return false;
   
    String str2 = str.substring(1, 3);
    return(str2.equals("ix"));
}

public String makeOutWord(String out, String word) {
   int middle = (out.length() ) / 2;
   return out.substring(0,middle)+word + out.substring(middle, out.length());
}
public String firstHalf(String str) {
   return str.substring(0 , str.length() / 2);
  
}
