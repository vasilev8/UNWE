/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenorodd;

import java.util.Scanner;

/**
 *
 * @author inf2067_usr
 */
public class EvenOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int num;
        num = s.nextInt();
        
        if ( num % 2 == 0 ){
        System.out.println("Result: even");
        }
        else{
        System.out.println("Result: odd");
    }
   }
}
