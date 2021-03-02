
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int lowerLimit,
            upperLimit,
            num;

        // write your code here
        
        System.out.print("First: ");
        lowerLimit = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        upperLimit = Integer.parseInt(reader.nextLine());
        
        num = lowerLimit;
        
        while(num <= upperLimit){
            System.out.println(num);
            num++;
        }
    }
}
