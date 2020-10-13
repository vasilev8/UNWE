/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

import java.util.Scanner;

/**
 *
 * @author inf2067_usr
 */
public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       int x, y;
       
        System.out.println("Enter x: ");
        x = s.nextInt();
        
        System.out.println("Enter y: ");
        y = s.nextInt();
        
        System.out.println("x is "+ x + "and y is "+ y);
        
        int temp;
        temp = x;
        x = y;
        y = temp;
        
        System.out.println("x is "+ x + "and y is "+ y);
        
    }
    
}
