import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String text;
        
        System.out.print("Type your name: ");
        text = reader.nextLine();
        
        System.out.print("Last character: " + lastCharacter(text));
    }
    
    public static char lastCharacter(String text){
        char lastCharacter = text.charAt(text.length() - 1);
        
        return lastCharacter;
    }
}
