import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String text;
        
        System.out.print("Type your name: ");
        text = reader.nextLine();
        
        System.out.print("First character: " + firstCharacter(text));
    }
    
    public static char firstCharacter(String text){
        char firstCharacter = text.charAt(0);
        
        return firstCharacter;
    }
}
