/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conevolume;

import java.util.Scanner;

/**
 *
 * @author inf2067_usr
 */
public class ConeVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double radius, height;
        System.out.println("Enter a radius: ");
        radius = s.nextDouble();
    if(radius <= 0){
        System.out.println("Radius must be >0");
        return;
    }
        System.out.println("Enter a height: ");
        height = s.nextDouble();
    if(height <= 0){
        System.out.println("Height must be >0");
    }
    
    double volume = (1/3.0)*Math.PI*
            Math.pow(radius, 2) * height;
        System.out.printf(
                "The volume of the cone is: %.2f\n", volume);
}
    
}
