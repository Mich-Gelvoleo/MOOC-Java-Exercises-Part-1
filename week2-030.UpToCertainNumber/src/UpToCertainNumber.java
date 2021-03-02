
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = 1,
            limit;
        
        // Write your code here
        
        System.out.print("Up to what number? ");
        limit = Integer.parseInt(reader.nextLine());
        
        while(num <= limit){
            System.out.println(num);
            num++;
        }
        
    }
}
