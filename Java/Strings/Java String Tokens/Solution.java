import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] aux = s.trim().split("[ !,?.\\_'@]+");
        
        if (s.trim().length()==0 || s.trim().length()>400000){
            System.out.println(0);
            return;
        }
                                
        System.out.println(aux.length);
        for(String token : aux){
            System.out.println(token);
        }
        scan.close();
    }
}
