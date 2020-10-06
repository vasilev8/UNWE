/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

import java.util.Scanner;


public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double x, y;
        System.out.println("Please enter X: ");
        x = s.nextDouble();
        System.out.println("Please enter Y: ");
        y = s.nextDouble();
        
        double z;
        z = x + y;
        System.out.println("z = " + z);

        z = x - y;
        System.out.println("z = " + z);

        z = x * y;
        System.out.println("z = " + z);

        z = x / y;
        System.out.println("z = " + z);

        z = y / x;
        System.out.println("z = " + z);

        z = 1 / x;
        System.out.println("z = " + z);

        z = y % x;
        System.out.println("z = " + z);

        double result = x + y + z;
        System.out.println("result is " + result);
        System.out.printf("result is %.3f\n", result);

        result = (x + y) * z;
        System.out.println("result is " + result);

        result = (x * (100 - y)) / z;
        System.out.println("result is " + result);
    }
    
}
