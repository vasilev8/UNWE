/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzamaker;

import java.util.Scanner;

public class PizzaMaker {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Pizza type: ");
        String pizzaType = s.next();
        
        System.out.println("Diameter: ");
        int diameter = s.nextInt();
        
        System.out.printf("Thickness: ");
        float thickness = s.nextFloat();
        
        System.out.println("Select topping 1: ");
        String topping1 = s.next();
        
        System.out.println("Select topping 2: ");
        String topping2 = s.next();
        
        System.out.println("How many slices: ");
        int slices = s.nextInt();
        
        System.out.printf("You have ordered a %d cm %s pizza, "
                +" %.1f cm thick, which has %s and %s."
        + " It will be cut in %d slices\n",
                diameter, pizzaType, thickness, topping1, topping2, slices);
        
        double radius = diameter / 2.0;
        double volume = Math.PI * Math.pow(radius, 2) * thickness;
        
        System.out.printf(
                "The volume of the pizza with radius "
                + "%.0f and height %.1f is %.2f cm3\n",
                radius, thickness, volume);
        
    }
    
}
