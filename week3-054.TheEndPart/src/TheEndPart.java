import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word,
               result;
        int endLength,
            startPos;
        
        System.out.print("Type a word: ");
        word = reader.nextLine();
        
        System.out.print("Length of the end part: ");
        endLength = Integer.parseInt(reader.nextLine());
        
        startPos = word.length() - endLength;
        
        System.out.print("Result: " + word.substring(startPos, word.length()));
    }
}
