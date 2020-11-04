/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package century;

import java.util.Scanner;

public class Century {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Year: ");
        int year = s.nextInt();
        
        if (year > 1900 && year < 2001){
            System.out.println("During 20th century");
        }
        if (year > 2000){
            System.out.println("After 20th century");
        }
        if (year < 1901){
            System.out.println("Before 20th century");
        }
         
    }
    
}
