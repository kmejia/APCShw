public class Sarray2 {
    	String[] data;//the larger array aka the entire data
    	int last;// will at most be the length of data set

    	public Sarray2() {
        	// set up the initial instance variables
		data = new String[16];
		// Set default value to 0
		for (int i = 0; i < data.length; i++){
			data[i] = "";
		}
		last = 0;
    	}







    	public boolean add(String i){
        	// adds an item to the end of the list, grow if needed
        	// returns true
		try {
			if (size() == data.length){
			    String[] buffer = new String[data.length + 1];//buffer is essentially the new data
				for (int n = 0; n < data.length; n++){
					buffer[n] = data[n];
				}
				buffer[data.length] = i;
				data = buffer;
				last++;
			}
			else {
				data[last] = i;
				last++;
			}
			return true;
		} catch(Exception e){
			e.printStackTrace();
		}
		return false;
    	}

    	public void add(int index, String k){
        	// adds item i  at index, shifting everything down as needed.
        	// also grows as needed 
		if (last < index) {last = index - 1;} //Grow!
		String[] buffer = new String[last + 1]; 
		try{
			for (int i = 0; i < buffer.length; i++){
				if (i < index){
					buffer[i] = data[i];
				}
				else if (i == index){
					buffer[i] = k;
				}
				else {
					buffer[i] = data[i - 1];
				}
			}
			data = buffer;
			last++;
		} catch(Exception e){e.printStackTrace();}

    	}

    	public int size() {
        	// returns the number of items in the list (not the array size)
		return last;
    	}

    	public String get(int index) {
        	// returns the item at location index of the lsit
        	try{
	        	return data[index];
	        } catch(Exception e){System.out.println("Out of bounds.");}
		return "-1";
    	}

    	public String set(int index, String i){
        	// sets the item at location index to value i
        	// returns the old value.
        	try{
        		String buffer = data[index];
        		data[index] = i;
        		return buffer;
        	} catch(Exception e){System.out.println("Out of bounds.");}//the error message
        	return "-1";
        	
    	}

    	public String remove(int index){
        	// removes the item at index i
        	// returns the old value
		String[] buffer = new String[size() - 1];
		String toReturn="";
		for (int i = 0; i < buffer.length; i++){
			if (i < index){
                        	buffer[i] = data[i];
                        }
                        else if (i==index) {
                                //buffer[i] = obj;
                                toReturn = buffer[i];
                        }
                        else {
                                buffer[i] = data[i + 1];
                        }
                }
		last--;
		data = buffer;
		return toReturn;
    	}
    ///shifting outline
// Given int array a with last item at index "last"
// newvalue is the new value to insert
//omy works once for one value that is an int
    /*   int i;
    for (i = last; i > 0 && newvalue < a[i-1] ; i--) {
	a[i] = a[i-1];    
    }
    a[i]=newvalue;
    */
    ///hw 20/////////////------------

    public void isort() {//to be used after obj are added, none of elements are sorted
	for (int place = 1/*we always refer to value beforehand*/; place < data.length; place++) {
	    String s = data[place];
	    //this is what gets compared


	    int i;//this is a local var because we refer to it outside of for loop
	    for (i = place - 1/*starts at zero*/; (i > -1) && (s.compareTo(data[i]) < 0); i--) {
		data[i+1] = data[i];//loop stops once the string on data is higher on the alphabet than string s
	    }
	    data[i+1] = s;//s is placed in its place
	}

    }
    public String toString(){
	String s = "";
	for (int i = 0; i < data.length; i++) {
	    
	    s = s + data[i] +" ";
	    
	    //s = s + "\n";
	}
	return s;
    }


    public static void main(String[] args) {
	Sarray2 k = new Sarray2();
	k.add("falcon");
	k.add("punch");
	k.add("zzzzz's");
	k.add("melee");
	System.out.println(k);
	k.isort();
	System.out.println(k);
	//for some reason givses the reverse order
	//update, fixed

    }
}




