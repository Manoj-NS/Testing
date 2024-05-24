package learnselenium.day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExperssionLearning {
	
	public static void main(String[] args) {
		 
		String actualPattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9+.-]+[a-zA-Z+]$";                     //"^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		
		String expectedPattern ="manoj@muthutech.com";
		
        // Create a Pattern object
        Pattern pattern = Pattern.compile(actualPattern);

        // Create a Matcher object and match the entered email against the pattern
        Matcher matcher = pattern.matcher(expectedPattern);

        // Check if the email address matches the pattern
        boolean isexpectedPatternValid = matcher.matches();
        
        if (isexpectedPatternValid) {
            System.out.println("Valid Pattern: " + expectedPattern);
        } else {
            System.out.println("Invalid Pattern: " + expectedPattern);
        }
 	}

}
