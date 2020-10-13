/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.Scanner;

/**
 *
 * @author inf2067_usr
 */

public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int randomNumber;
        randomNumber = (int) (Math.random() * 10 + 1);
        
        System.out.println("Your guess: ");
        int guess = s.nextInt();
        
        boolean hasGuessed = randomNumber == guess;
        System.out.printf("Your guess is %b - it was %d\n",hasGuessed, randomNumber);
        
        }
    }
    

