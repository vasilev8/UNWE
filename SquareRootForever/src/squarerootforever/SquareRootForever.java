
package squarerootforever;

import java.util.Scanner;
public class SquareRootForever {

     public static void main(String []args){
         
         Scanner s = new Scanner(System.in);
         
         String command = "";
         
         while(true) {
            System.out.print("Number: ");
            int number = s.nextInt(); 
            double result = Math.sqrt(number);
            System.out.printf("Square root: %.2f\n", result);
            System.out.print("Command: ");
            command = s.next();
            if(command.equals("exit")) {
                break;
            }
        }
    }   
}
