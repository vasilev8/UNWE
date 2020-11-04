package diceroll;

import java.util.Scanner;

public class DiceRoll {

    public static void main(String[] args) {
        
        
    System.out.println("Desired sum of two rolls: ");
        
    Scanner s = new Scanner(System.in);
    int guess = s.nextInt();
    if(guess > 12){
        System.out.println("The sum\n" +
        "of two rolls cannot be greater than 12 ");
        return;
    } if (guess < 2){
        System.out.println("The sum of two rolls cannot be\n" +
        "less than 2");
        return;
    }

        
        int randomNumber1;
        randomNumber1 = (int) (Math.random() * 6 + 1);
        int randomNumber2;
        randomNumber2 = (int) (Math.random() * 6 + 1);
        
        int sum;
        sum = randomNumber1 + randomNumber2;
        System.out.println("First roll was "+randomNumber1+", second roll was "+randomNumber2+", the sum is "+sum+".");
        
        boolean hasGuessed = sum == guess;
        System.out.printf("Win: %b",hasGuessed);
    }
    
}
