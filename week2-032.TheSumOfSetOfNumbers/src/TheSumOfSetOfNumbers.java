
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int limit,
            sum = 0,
            count = 0;
        
        System.out.print("Until what? ");
        limit = Integer.parseInt(reader.nextLine());
        
        while(count <= limit){
            sum += count;
            count ++;
        }
        
        System.out.print("Sum is " + sum);
    }
}
