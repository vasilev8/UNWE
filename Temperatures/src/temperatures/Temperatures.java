
package temperatures;

import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Temperature:  ");
        double temp = s.nextDouble();
        System.out.print("Unit: ");
        int unit = s.nextInt();
        
        if (unit == 1){
            double faren = (0.9/0.5) * temp + 32;
            System.out.printf("Fahrenheit: %.2f\n", faren);
            double kelvin = temp + 273.15;
            System.out.printf("Kelvin: %.2f", kelvin);
        }
        if (unit == 2){
            double celsius = 5 * ((temp-32)/9);
            System.out.printf("Celsius: %.2f\n", celsius);
            double kelvin = 5 * ((temp-32)/9) + 273.15;
            System.out.printf("Kelvin: %.2f", kelvin);
        }
        if (unit == 3){
            double celsius = temp - 273.15;
            System.out.printf("Celsius: %.2f\n", celsius);
            double faren = (0.9/0.5) * (temp - 273.15) + 32;
            System.out.printf("Fahrenheit: %.2f\n", faren);
        }
        if (unit < 1 || unit > 3){
            System.out.println("Unsupported unit");
        }
    }
    
}
