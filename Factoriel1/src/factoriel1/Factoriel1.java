
package factoriel1;

import java.util.Scanner;


public class Factoriel1 {

   
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       System.out.print("Factoriel of: ");
        int n = Integer.parseInt(s.nextLine());
        int fact = 1;
        while(n>1) {
            fact = fact * n;
            n--;
        }
        System.out.printf("%d! = %d", n , fact);
    }
    
}
