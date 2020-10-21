/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author hrist
 */
public class TempConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double fahren;
        fahren = 98;
        System.out.printf("Temperature in Fahrenheit is: %.1f\n", fahren);
        double celsius = 5 * ((fahren-32)/9);
        System.out.printf("Temperature in Celsius is: %.15f", celsius);
        
    }
    
}
