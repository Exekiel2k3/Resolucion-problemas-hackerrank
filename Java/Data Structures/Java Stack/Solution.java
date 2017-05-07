import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isBalanced(input));
        }
        sc.close();
    }

    public static boolean isBalanced(String input) {
        //Complete the code
        Stack<Character> charStak = new Stack<>();
        
        int length = input.length();
        
        for (int i = 0; i < length; i++) {
            final char charAt = input.charAt(i);
            
            try {
                switch (charAt) {
                    case '(':
                        charStak.push(charAt);
                        break;
                    case ')':
                        charStak.pop();
                        break;
                    case '{':
                        charStak.push(charAt);
                        break;
                    case '}':
                        charStak.pop();
                        break;
                    case '[':
                        charStak.push(charAt);
                        break;
                    case ']':
                        charStak.pop();
                        break;                    
                }
            } catch (EmptyStackException e) {
                return false;
            }
        }
        return charStak.empty();
    }
      
   
}
