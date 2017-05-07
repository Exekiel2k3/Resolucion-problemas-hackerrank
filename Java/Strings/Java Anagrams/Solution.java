import java.io.*;
import java.util.*;

public class Solution {
    
    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        if(a.length() != b.length()) return false;
        if(a==null && b==null) return true;
        if(a.equals(b)) return true;
        
        Map<Character, Integer> map = new HashMap<>(); 
        Character letra;
        int cantidadLetra;
        int sumA = 0;
        int sumB = 0;
        
        for(int i= 0; i<a.length(); i++){
            
            letra = a.charAt(i);
            if(!map.containsKey(letra)){
                map.put(letra,1);
            }else{
                cantidadLetra = map.get(letra);
                map.put(letra, ++cantidadLetra);
            }
            
            letra = b.charAt(i);
            if(!map.containsKey(letra)){
                map.put(letra,-1);
            }else{
                cantidadLetra = map.get(letra);
                map.put(letra, --cantidadLetra);
            }           
        }
        
        for(Object key : map.keySet()){
            if(map.get(key)!=0) return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}    
