import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int arr[] = new int[length];
        int cantidadNeg = 0;
        int suma=0;

        for(int i=0; i < length; i++){
            arr[i] = in.nextInt();
        }

        for(int j = 1; j <=length; j++){

            for(int k=0; k + (j-1) < length; k++){
                
                for(int l=k; l < j+k; l++){
                    suma += arr[l];
                }
            
                if(suma < 0){
                    cantidadNeg++;
                }
                suma=0;
            }            
        }
        System.out.println(cantidadNeg);        
        
    }
}
