import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        BigInteger A= new BigInteger(sc.next());
        BigInteger B= new BigInteger(sc.next());
        sc.close();
        System.out.println(A.add(B).toString());
        System.out.println(A.multiply(B).toString());
        
    }
}
