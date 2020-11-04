
package excel;

import java.util.Scanner;

public class Excel {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("x: ");
        double x = Integer.parseInt(s.nextLine());
        System.out.print("y: ");
        double y = Integer.parseInt(s.nextLine());
        System.out.print("z: ");
        double z = Integer.parseInt(s.nextLine());
        
        System.out.print("Function: ");
        String function = s.nextLine();
        
        if (function.equals("SUM")){
            double result = x + y + z;
            System.out.printf("Result: %.4f", result);
            return;
        }
        if (function.equals("AVERAGE")){
            double result = (x + y + z) / 3.0;
            System.out.printf("Result: %.4f", result);
            return;
        }
        if (function.equals("MIN")){
            if(x < y && x < z){
		System.out.printf("Result: %.4f", x);
	}
	else if(y < z){
		System.out.printf("Result: %.4f" , y);
	}
	else{
		System.out.printf("Result: %.4f" , z);
	}
            return;
      }
        if (function.equals("MAX")){
            if(x > y && x > z){
		System.out.printf("Result: %.4f" , x);
	}
	else if(y > z){
		System.out.printf("Result: %.4f" , y);
	}
	else{
		System.out.printf("Result: %.4f" , z);
	}
       }
        
        else {
            System.out.print("Unsupported function");
        }     
    }  
}
