
package geometricprogression;

import java.util.Scanner;

public class GeometricProgression {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
                int min, max;
		System.out.print("Min: ");
		min = s.nextInt();
		System.out.print("Max: ");
		max = s.nextInt();
                
                for(int number = min; number <= max; number*=2){ 
                        System.out.println(number);
                }
    }  
}
