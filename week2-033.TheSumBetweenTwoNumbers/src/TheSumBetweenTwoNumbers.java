
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        int lowerLimit,
            upperLimit,
            sum = 0,
            num;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        lowerLimit = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        upperLimit = Integer.parseInt(reader.nextLine());
        
        num = lowerLimit;
        
        while(num <= upperLimit){
            sum += num;
            num++;
        }
        
        System.out.println("The sum is " + sum);
        
    }
}
