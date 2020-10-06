/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypotenuse;

import java.util.Scanner;


public class Hypotenuse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a,b;
        System.out.println("Please enter side A: ");
        a = s.nextInt();
        System.out.println("Please enter side B: ");
        b = s.nextInt();
        
        double c;
        c = Math.sqrt(a * a + b * b);
        System.out.println("The lenght of the hypotenuse is " + c);
    }
    
}
