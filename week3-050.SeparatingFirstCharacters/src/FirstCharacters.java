import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String text;
        int i = 0;
        
        System.out.print("Type your name: ");
        text = reader.nextLine();
        
        if(text.length() > 3){
            while(i < 3){
                System.out.println(i + 1 +". character: " + text.charAt(i));
                i++;
            }
        }
    }
}
