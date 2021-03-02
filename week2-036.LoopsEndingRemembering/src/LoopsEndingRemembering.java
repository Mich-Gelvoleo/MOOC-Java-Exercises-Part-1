import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        int num,
            sum = 0,
            evenCount = 0,
            oddCount = 0,
            count = 0; 
        
        double average = 0;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers: ");
        while(true){
            num = Integer.parseInt(reader.nextLine());
            
            if(num == -1){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + count);
                System.out.println("Average: " + average);
                System.out.println("Even Numbers: " + evenCount);
                System.out.println("Odd Numbers: " + oddCount);
                break;
            }
            else{
                sum += num;
                count++;
                average = (double)sum / count;
                
                if(num % 2 == 0){
                    evenCount++;
                }
                else{
                    oddCount++;
                }
            }
        }

    }
}
