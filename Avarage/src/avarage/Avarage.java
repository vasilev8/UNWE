
package avarage;

import java.util.Scanner;

public class Avarage {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("First number: ");
        long firstNum = s.nextLong();
        if(firstNum > 99999999 ){            
        } else{
            return;
        }
        System.out.printf("Second number: ");
        long secondNum = s.nextLong();
        if(secondNum > 99999999 ){
        } else{
            return;
        }
        System.out.printf("Third number: ");
        long thirdNum = s.nextLong();
        if(thirdNum > 99999999 ){
        } else{
            return;
        }
    double sum;
    sum = (firstNum + secondNum + thirdNum)/3;
        System.out.printf("The avarage is  %,.4f",sum);
    }
    
}
