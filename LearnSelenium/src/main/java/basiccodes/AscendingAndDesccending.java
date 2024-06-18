package basiccodes;

import java.util.Arrays;
import java.util.Collections;

public class AscendingAndDesccending {

    public static void main(String[] args) {
    	
    	Integer[] array = {1, 5, 3, 2, 4};
    	Arrays.sort(array);
    	
    	for(int i=0; i<array.length; i++) {
    		System.out.println("Asc: "+array[i]);
    	}
    	
		Arrays.sort(array, Collections.reverseOrder());
		
		for (int j = 0; j < array.length; j++) {
		  System.out.println("Desc: "+array[j]);
		}
    }
}
	


