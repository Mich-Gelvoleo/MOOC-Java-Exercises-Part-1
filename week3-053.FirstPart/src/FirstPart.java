
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String text;
        int length;
        
        System.out.print("Type a word: ");
        text = reader.nextLine();
        
        System.out.print("Length of the first part: ");
        length = Integer.parseInt(reader.nextLine());
        
        System.out.print("Result: " + text.substring(0, length));
    }
}
