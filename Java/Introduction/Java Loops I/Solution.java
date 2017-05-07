import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1; i<11;i++)
            System.out.printf("%s x %d = %d %n",x,i,x*i);
    }
}
