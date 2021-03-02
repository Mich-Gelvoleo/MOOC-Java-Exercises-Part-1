
import java.util.Scanner;
import java.lang.Math;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int power,
            count = 0,
            result = 0;
        
        System.out.print("Type a number: ");
        power = Integer.parseInt(reader.nextLine());
        
       while(count <= power){
           result += (int)Math.pow(2, count);
           count++;
       }
        
        System.out.println("The result is " + result);
    }
}
