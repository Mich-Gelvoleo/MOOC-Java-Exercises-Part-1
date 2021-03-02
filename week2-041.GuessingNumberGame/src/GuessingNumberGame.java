
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber(),
            count = 0,
            num;

        // program your solution here. Do not touch the above lines!
        while(true){
            System.out.print("Guess a number: ");
            num = Integer.parseInt(reader.nextLine());
            
            if(num < numberDrawn){
                count++;
                System.out.println("The number is greater, guesses made " + count);
            }
            
            if(num > numberDrawn){
                count++;
                System.out.println("The number is lesser, guesses made " + count);
            }
            
            if(num == numberDrawn){
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
