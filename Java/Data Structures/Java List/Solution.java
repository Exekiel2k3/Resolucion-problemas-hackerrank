import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = openScanner();
        
        List<Integer> list = new ArrayList<>();
        int lengthL = in.nextInt();
        
        loadList(lengthL, list, in);
        
        int lengthQ = in.nextInt();
        for(int i = 0; i < lengthQ; i++){
            in.nextLine();
            switch(in.next()) {
                case "Insert":
                    insertList(list,in.nextInt(), in.nextInt());
                break;
                case "Delete": 
                    deleteList(list, in.nextInt());
                break;
            }
        }
        
        closeScanner(in);
        for (Integer list1 : list) {
            System.out.print(list1.toString() + " ");
        }
    }
    
    public static void deleteList(List<Integer> list, int index) {
        list.remove(index);
    }

    public static void insertList(List<Integer> list, int index, int element) {
        list.add(index,element);
    }

    public static void loadList(int length, List<Integer> List, Scanner in) {
        for(int i = 0; i < length; i++){
            List.add(in.nextInt());
        }
    }

    public static void closeScanner(Scanner in) {
        in.close();
    }

    public static Scanner openScanner() {
        return (new Scanner(System.in));
    }
}
