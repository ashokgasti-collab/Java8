package app_java_2;
import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(ArrayList<Integer> arr) {
    // Write your code here
    Integer total=0;
        for(int i= 0; i < arr.size(); i ++){
            Collections.sort(arr);
            total += arr.get(i);
        }


    System.out.println(total - arr.get(arr.size()-1) +" " + (total -arr.get(0)));
      

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
