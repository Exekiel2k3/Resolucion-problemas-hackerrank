import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int n = 6;
        int nSubArr = 3;       
        int[][] subArray = new int[nSubArr][nSubArr];
        int suma=Integer.MIN_VALUE;
        int sumAux;
        
        
        for (int i = 0; i+nSubArr <= n; i++) {
            for (int j = 0; j+nSubArr <= n; j++) {
                sumAux = sumArray(nSubArr, hourGlass(subArray(i,j,nSubArr, nSubArr, arr), nSubArr));
                if(sumAux > suma){
                    suma = sumAux;
                }
            }
        }
        System.out.print(suma);
    }
    
        public static int[][] subArray(int iniFila, int iniCol, int fila, int columna, int[][] arr) {
        int[][] subArray = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                subArray[i][j] = arr[i+iniFila][j+iniCol];
            }
        }
        return subArray;
    }

        public static int sumArray(int n, int[][] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static int[][] hourGlass(int[][] arr,int n) {
        
        int k;
        int[][] arrAux = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            
            if(i<n/2){
                k=i%n;
            }else{
                k=(n-1)-(i%n);
            }
            
            for (int j = k; j < n-k; j++) {
                arrAux[i][j] = arr[i][j];
            }
        }
        return arrAux;
    }   
}
