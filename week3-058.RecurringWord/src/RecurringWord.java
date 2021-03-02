
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        
        ArrayList<String> words = new ArrayList<String>();
        
        Boolean check = true;
        String input;
        
        while(check){
            System.out.print("Type a word: ");
            input = reader.nextLine();
            
            if(words.contains(input)){
                System.out.print("You gave the word " + input + " twice");
                check = false;
            }
            
            words.add(input);
        }
        
    }
}
