import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int num,
            result = 1, 
            count = 1;
        
        System.out.print("Type a number: ");
        num = Integer.parseInt(reader.nextLine());
        
        while(count <= num){
            result *= count;
            count++;
        }
        
        System.out.println("Factorial is " + result);
        
    }
}
