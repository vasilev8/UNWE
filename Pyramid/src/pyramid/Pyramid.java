package pyramid;

import java.util.Scanner;


public class Pyramid {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a,b,h;
        System.out.print("a: ");
        a = s.nextInt();
        System.out.print("b: ");
        b = s.nextInt();
        System.out.print("h: ");
        h = s.nextInt();
        
        double v;
        v = ((1/3.0)*(a*b*h));
        
        System.out.printf("The volume of a rectangular pyramid with sides " + a + " and " + b + " and height " + h + " is %.3f",v);
      
    }
    
}
