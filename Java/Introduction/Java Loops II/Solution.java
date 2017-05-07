import java.util.*;
import java.io.*;
import static java.lang.Math.pow;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sumAux = 0;
            
            for(int n1=0; n1<n; n1++){
                sumAux += (pow(2,n1) * b);
                System.out.printf("%d ",a + sumAux);
            }
            
            System.out.printf("%n");
            
        }
        in.close();
    }
}
