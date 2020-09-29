/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

/**
 *
 * @author inf2067_usr
 */
public class Variables {

    public static void main(String[] args) {
        byte personAge = 21;
        System.out.println("Age: " + personAge);
        
        byte grade = 6, temperature = -6;
        System.out.printf("My grade is %d.\nThe temperature is %d.\n", grade, temperature);
        
        short distanceBetweenSofiaAndBerlin;
        distanceBetweenSofiaAndBerlin = 1634;
        System.out.println("The distance is = " +distanceBetweenSofiaAndBerlin);
        
        int population = 808080;
        System.out.println("The population is = " + population);
        
        long numberOfCells;
        numberOfCells = 37_200_000_000_000l;
        System.out.println("Number of cells = " + numberOfCells);
        
        float water = 1.85f;
        System.out.println("I have "+ water + " liters of water");
        
        double cash = 35.50;
        System.out.println("I have "+cash+" leva");
        System.out.printf("I have %.2f leva.\n", cash);
        
        boolean agreed = false;
        agreed = true;
        
        boolean canBuyBeer = personAge >= 18;
        System.out.println("Can you buy beer = "+ canBuyBeer);
        
        char gender = 'M';
        System.out.println("Your gender is "+ gender);
        
        String myName = "Viktor Vasilev";
        System.out.println("My name is "+myName);
        
        String job;
        job = "Web Developer";
        System.out.printf("I work as a %s\n", job);
    }
    
}
