/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverterinput;

import java.util.Scanner;

/**
 *
 * @author hrist
 */
public class TempConverterInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double fahren;
        System.out.printf("What's the temperature in Fahrenheit? ");
        fahren = s.nextDouble();
        System.out.printf("Temperature in Fahrenheit is: %.2f\n", fahren);
        double celsius = 5 * ((fahren-32)/9);
        System.out.printf("Temperature in Celsius is: %.2f", celsius);
    }
    
}
