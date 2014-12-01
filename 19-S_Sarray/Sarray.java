//paired with Fanny on fri
public class Sarray {
    	String[] data;//the larger array aka the entire data
    	int last;// will at most be the length of data set

    	public Sarray() {
        	// set up the initial instance variables
		data = new String[16];
		// Set default value to 0
		for (int i = 0; i < data.length; i++){
			data[i] = " ";
		}
		last = 0;
    	}
    public String toString(){
	String s = "";
	for (int i = 0; i < data.length; i++) {
	    
	    s = s + data[i] +" ";
	    
	    //s = s + "\n";
	}
	return s;
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
        	// returns the item at location index of the list
        	try{
	        	return data[index];
	        } catch(Exception e){System.out.println("Out of bounds.");
	        return "out of bounds";

		}
	}
    
    	public String set(int index, String s){
        	// sets the item at location index to value i
        	// returns the old value.
        	try{
        		String buffer=data[index];
        		data[index] = s;
        		return buffer;
        	} catch(Exception e){System.out.println("Out of bounds.");}//the error message
        	return "SOS";
        	
    	}

    	public String remove(int index){
        	// removes the item at index i
        	// returns the old value
	    String[] buffer = new String[size()];//changed size
		String toReturn="";
		for (int i = 0; i < buffer.length; i++){
			if (i < index){
                        	buffer[i] = data[i];
                        }
                        else if (i == index) {
                                //buffer[i] = obj;
                                toReturn = buffer[i];
                        }
                        else {
			    try{
				buffer[i] = data[i + 1];}
			    catch(Exception e){buffer[i]="";}
			}
                }
		last--;
		data = buffer;
		return toReturn;
    	}

    public static void main(String[] args){
	Sarray k = new Sarray();
	k.add("example");
	k.add("yes");
	k.add("falcon");
	k.add("punch");
	k.add(2,"switch");
	System.out.println(k);
	System.out.println(k.size());
	System.out.println(k.get(1));
	System.out.println(k.set(1,"no"));
	System.out.println(k);
	System.out.println(k.remove(3));
	System.out.println(k);
    }




}
