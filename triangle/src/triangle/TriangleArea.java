/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.util.Scanner;
/**
* Calculates the area of a triangle
* @author Venko Andonov
* @version 2.0
*/
public class TriangleArea {
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);

 double a; 
 System.out.print("Please enter A: ");
 a = s.nextDouble();
 
 double c;
 System.out.print("Please enter C (hypotenuse): ");
 c = s.nextDouble();

 double b;
 b = Math.sqrt((c*c - a*a));
 double area;
 area = (a * b) / 2;
 System.out.printf("The area of the triangle is %.3f\n", area);
    
}
}
