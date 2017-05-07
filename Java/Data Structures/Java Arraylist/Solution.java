import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cantidad = in.nextInt();
        int cantidad2;
        int longLista;
        
        ArrayList<ArrayList<Integer>> fila = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i < cantidad; i++){
            ArrayList<Integer> columna = new ArrayList<Integer>();
            longLista = in.nextInt();
            for(int j=0; j < longLista; j++){
                columna.add(in.nextInt());
            }
            fila.add(i,columna);
        }        
        
        cantidad2 = in.nextInt();
        
        for(int i=0; i < cantidad; i++){
            for(int j=0; j < 2; j++){
                
                int indf = in.nextInt()-1;
                int indc = in.nextInt()-1;
                
                try{
                    System.out.println(fila.get(indf).get(indc));
                }catch(IndexOutOfBoundsException e){
                    System.out.println("ERROR!");
                }
            }
        }
    }
}
