import java.util.Scanner;
import java.util.*;

public class Palindromi {

    public static String reverse(String text){
       String helper = "";
        int i;
        
        i = text.length() - 1;
        
        while(i >= 0){
            helper += text.charAt(i);
            i--;
        }
        return helper;
    }
    
    public static boolean palindrome(String text) {
        // write code here
        
        String reverse = reverse(text);
        
        if(text.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
      
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
