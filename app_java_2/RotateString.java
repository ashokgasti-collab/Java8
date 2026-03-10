package app_java_2;
import java.util.Scanner;
public class RotateString {
	
	    public static String rotateString(String str, int rotations,int r2) {
	        // Calculate the effective number of rotations
	    	
	        int effectiveRotations = rotations % str.length();
	        
	        // Rotate the string by extracting substrings
	        int i = 0,count=0;
	        for(int k=0;k<10;k++) {
	        StringBuilder rotatedString = new StringBuilder(str);

	        while (i < effectiveRotations) {
	            char firstChar = rotatedString.charAt(0);
	            rotatedString.deleteCharAt(0);
	            rotatedString.append(firstChar);
	            i++;
	            count++;
	            if(str.equals(rotatedString))
	            break;
	        }
	       
	        StringBuilder rotatedString1 = new StringBuilder(rotatedString);
	        int rot2 = r2 % rotatedString1.length();
	        int j=0;
	        while (j < rot2) {
	            char firstChar = rotatedString1.charAt(0);
	            rotatedString1.deleteCharAt(0);
	            rotatedString1.append(firstChar);
	            j++;
	            count++;
	            if(str.equals(rotatedString1))
	            break;
	        }
	        str=rotatedString1.toString();
	        }
	        System.out.println("count"+count);
	        return str;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        System.out.print("Enter the number of rotations: ");
	        int rotations = scanner.nextInt();
	        int r2 = scanner.nextInt();
	        scanner.close();

	        String rotatedString = rotateString(inputString, rotations,r2);
	        System.out.println("Rotated string: " + rotatedString);
	    }
	}

