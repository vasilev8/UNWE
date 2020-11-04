
package washingmachine;

import java.util.Scanner;


public class WashingMachine {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Pick a programme:  ");
        int pick = s.nextInt();
        
        if (pick == 1){
            System.out.println("Temperature: 60 degrees, Time: 125 minutes");
        }
        if (pick == 2){
            System.out.println("Temperature: 90 degrees, Time: 106 minutes");
        }
        if (pick == 3){
            System.out.println("Temperature: 40 degrees, Time: 98 minutes");
        }
        if (pick == 4){
            System.out.println("Temperature: 50 degrees, Time: 65 minutes");
        }
        if (pick == 5){
            System.out.print("Desired temperature: ");
            int desTemp = s.nextInt();
           
            System.out.print("Desired time: ");
            int desTime = s.nextInt();
            
            System.out.println("Temperature: "+ desTemp+" degrees, Time: "+desTime+" minutes");
        }
        if (pick < 1 || pick > 5){
            System.out.println("No such programme");
        }
    }
    
}
