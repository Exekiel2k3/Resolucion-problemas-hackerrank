import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        for (int i = 0; i < m; i++) {
            String accion = scan.next();
            int mBS = scan.nextInt();
            int nBS = scan.nextInt();
            
            switch(accion){
                case "AND": 
                    switch(mBS){
                        case 1: b1.and(b2);
                        break;
                        case 2: b2.and(b1);
                        break;
                    }
                break;
                case "SET": 
                    switch(mBS){
                        case 1: b1.set(nBS, true);
                        break;
                        case 2: b2.set(nBS, true);
                        break;
                    }
                break;
                case "FLIP": 
                    switch(mBS){
                        case 1: b1.flip(nBS);
                        break;
                        case 2: b2.flip(nBS);
                        break;
                    }
                break;
                case "OR": 
                    switch(mBS){
                        case 1: b1.or(b2);
                        break;
                        case 2: b2.or(b1);
                        break;
                    }
                break;
                case "XOR": 
                    switch(mBS){
                        case 1: b1.xor(b2);
                        break;
                        case 2: b2.xor(b1);
                        break;
                    }
                break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
