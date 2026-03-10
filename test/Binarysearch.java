package test;

import java.util.Arrays;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,8,7,5,1};
		Arrays.sort(arr);
		int l=0,r=arr.length-1,t=7;
		System.out.println(r);
		        int foundAt = -1;

		        while (l <= r) {
		            int mid = l + (r - l) / 2;

		            if (arr[mid] == t) {
		                foundAt = mid;
		                break;                // IMPORTANT: stop when found
		            } else if (arr[mid] < t) {
		                l = mid + 1;
		            } else {
		                r = mid - 1;
		            }
		        }

		        if (foundAt != -1) {
		            System.out.println("Found " + t + " at index " + foundAt + " (in the sorted array).");
		        } else {
		            System.out.println(t + " not found");
		        }
		    }

}
