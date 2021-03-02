
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String text;
        int i = 0;
        
        System.out.print("Type your name: ");
        text = reader.nextLine();
        
        while(i < text.length()){
            System.out.println((i + 1) + ". character: " + text.charAt(i));
            i++;
        }
    }
}
