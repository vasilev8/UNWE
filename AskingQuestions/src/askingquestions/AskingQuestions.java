/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askingquestions;

import java.util.Scanner;

public class AskingQuestions {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        byte personAge;
        System.out.println("How old are you?");
        personAge = s.nextByte();
        System.out.println("Age: " + personAge);
        
        System.out.println("What is the distance?");
        short distance = s.nextShort();
        System.out.println("Distance between Sofia and Berlin is " + distance + " km");
        
        int population;
        System.out.println("How many people live in Bulgaria?");
        population = s.nextInt();
        System.out.println("The population of Bulgaria is " + population);
        
        double cash;
        System.out.println("How much money?");
        cash = s.nextDouble();
        System.out.printf("I have %.2f leva\n", cash);
        
        String myName;
        System.out.println("Your name: ");
        myName = s.next();
        System.out.println("My name is " + myName);
     
    }
    
}
