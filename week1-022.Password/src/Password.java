
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String pw;

        // Write your code here
        while(true){
            System.out.print("Type the password: ");
            pw = reader.nextLine();
            
            if(pw.equals(password)){
                System.out.println("Right!");
                System.out.println("The secret is: 100 Years of Solitude");
                break;
            }
            else{
                System.out.println("Wrong!");
            }
        }
    }
}
