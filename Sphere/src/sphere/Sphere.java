/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sphere;

import java.util.Scanner;

/**
 *
 * @author inf2067_usr
 */
public class Sphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("The diameter of the sphere: ");
        double diameter = s.nextDouble();
        
        double radius = diameter / 2;
        
        double volume = (4/3.0) * Math.PI * Math.pow(radius, 3);
        
        System.out.printf("The volume of a sphere with diameter %.2f is %.4f\n",
                diameter, volume);
        
        double surface = 4 * Math.PI * Math.pow(radius, 2);
        System.out.printf("The surface area is %.4f\n", surface);
    }
    
}
