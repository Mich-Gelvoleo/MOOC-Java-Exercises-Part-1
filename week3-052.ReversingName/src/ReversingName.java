import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String text;
        int i;
        
        System.out.print("Type your name: ");
        text = reader.nextLine();
        
        System.out.print("In reverse order: ");
        
        i = text.length() - 1;
        
        while(i >= 0){
            System.out.print(text.charAt(i));
            i--;
        }
        
    }
}
