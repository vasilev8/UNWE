
package evenoroddloop;

import java.util.Scanner;


public class EvenOrOddLoop {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
                int from, to;
		System.out.print("Start from: ");
		from = s.nextInt();
		System.out.print("Up to:");
		to = s.nextInt();
                
                for (int number = from; number <= to; number++) {
                if (number % 2 == 0) {
                    System.out.printf("%d is even\n", number);
                } else {
                    System.out.printf("%d is odd\n", number);
                }
            }
         }
    
}
