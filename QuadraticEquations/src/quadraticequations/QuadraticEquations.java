
package quadraticequations;

import java.io.PrintStream;
import java.util.Scanner;


public class QuadraticEquations {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double a, b ,c;
        
        System.out.println("Enter A: ");
        a = s.nextDouble();
        
        System.out.println("Enter B: ");
        b = s.nextDouble();
        
        System.out.println("Enter C: ");
        c = s.nextDouble();
        
        if(a == 0){
        System.out.println("A cannot be zero");
        return;
    }
        double d = (b * b) - (4 * a * c);
        if(d<0){
            System.out.printf("No solution");
    } else if(d == 0){
            double x1 = -b /(2*a);
            System.out.printf("x1 = %.2f\n", x1);
        } else if(d > 0){
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        }
    }
    
}
