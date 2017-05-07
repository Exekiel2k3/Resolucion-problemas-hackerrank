import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner in = new Scanner(System.in);
        String word = in.next();
        int cant = in.nextInt();
        in.close();

        int i=0;
        int longitud = word.length() - cant + 1;
        String wordMax = word.substring(i,cant + i);
        String wordMin = word.substring(i,cant + i);
        String wordAux = word.substring(i,cant + i);
        
        for(i=1; i < longitud; i++){
            wordAux = word.substring(i,cant + i);
        
            if(wordAux.compareTo(wordMax) > 0)
                wordMax = wordAux;
            
            if(wordMin.compareTo(wordAux) > 0)
                wordMin = wordAux;           
        }        
        System.out.println(wordMin + "\n" + wordMax);
    }
}
