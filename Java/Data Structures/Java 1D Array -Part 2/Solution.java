import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn =new Scanner(System.in);
        int a = scn.nextInt(); 
        for(int j = 0; j < a; j++){
            int n = scn.nextInt();  
            int[] arrB = new int[n];
            int m = scn.nextInt(); 
            for(int f =0; f< n; f++){ arrB[f]=scn.nextInt(); }
            if(isSolvable(m, arrB, 0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            } 
        }
    }
    private static boolean isSolvable(int m, int[] arr, int i) {
        if (i < 0 || arr[i] == 1) return false;
        if ((i == arr.length - 1) || i + m > arr.length - 1) return true;
        arr[i] = 1;
        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
    }
}
