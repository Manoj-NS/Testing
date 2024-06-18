package basiccodes;

import java.util.Arrays;

public class FindLeastVlue {
	public static void main(String[] args) {
		
		Integer[] numbers= {8,6,7,3,1,9};
		
		Arrays.sort(numbers);
		int leastValue=numbers[0];		
		System.out.println("Least Number is: "+leastValue);
		
		int a=5;
		int b=20;
		
		int smallerValue=Math.min(a,b);
		System.out.println("Smaller Value is :"+smallerValue);
	}

}
