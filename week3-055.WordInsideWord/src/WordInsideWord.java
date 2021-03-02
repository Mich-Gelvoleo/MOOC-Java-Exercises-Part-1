
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String firstWord,
               secondWord;
        
        int index;
        
        System.out.print("Type the first word: ");
        firstWord = reader.nextLine();
        
        System.out.print("Type the second word: ");
        secondWord = reader.nextLine();
        
        index = firstWord.indexOf(secondWord);
        
        if(index >= 0){
            System.out.print("The word \'" + secondWord + "\' is found in the word \'" + firstWord + "\'.");
        }
        else{
            System.out.print("The word \'" + secondWord + "\' is not found in the word \'" + firstWord + "\'.");
        }
    }
}
