
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String firstName = reader.nextLine();
        
        System.out.print("Type your age: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String secondName = reader.nextLine();
        
        System.out.print("Type your age: ");
        int b = Integer.parseInt(reader.nextLine());
        
        int sum = a + b;
        
        System.out.println(firstName + " and " + secondName + " are " + sum + " years old in total.");
    }
}
