import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int numA = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the second number: ");
        int numB = Integer.parseInt(reader.nextLine());
        
        if(numA > numB)
            System.out.print("Greater number: " + numA);
        else if(numA < numB)
            System.out.print("Greater number: " + numB);
        else 
            System.out.print("The numbers are equal!");
    }
}
