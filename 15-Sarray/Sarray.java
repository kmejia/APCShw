//paired with Ethan on Fri.
//we wrote the original code on his repo

public class Sarray {
    	int[] data;//the larger array aka the entire data
    	int last;// will at most be the length of data set

    	public Sarray() {
        	// set up the initial instance variables
		data = new int[16];
		// Set default value to 0
		for (int i = 0; i < data.length; i++){
			data[i] = 0;
		}
		last = 0;
    	}

    	public boolean add(int i){
        	// adds an item to the end of the list, grow if needed
        	// returns true
		try {
			if (size() == data.length){
			    int[] buffer = new int[data.length + 1];//buffer is essentially the new data
				for (int n = 0; i < data.length; n++){
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

    	public void add(int index, int k){
        	// adds item i  at index, shifting everything down as needed.
        	// also grows as needed 
		if (last < index) {last = index - 1;} //Grow!
		int[] buffer = new int[last + 1]; 
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

    	public int get(int index) {
        	// returns the item at location index of the lsit
        	try{
	        	return data[index];
	        } catch(Exception e){System.out.println("Out of bounds.");}
	        return -1;
    	}

    	public int set(int index, int i){
        	// sets the item at location index to value i
        	// returns the old value.
        	try{
        		int buffer = data[index];
        		data[index] = i;
        		return buffer;
        	} catch(Exception e){System.out.println("Out of bounds.");}//the error message
        	return -1;
        	
    	}

    	public int remove(int index){
        	// removes the item at index i
        	// returns the old value
		int[] buffer = new int[size() - 1];
		int toReturn;
		for (int i = 0; i < buffer.length; i++){
			if (i < index){
                        	buffer[i] = data[i];
                        }
                        else if (i == index) {
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
}
