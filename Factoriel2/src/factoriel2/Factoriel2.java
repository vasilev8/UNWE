/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoriel2;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Factoriel2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int from, to;
		System.out.println("From: ");
		from = s.nextInt();
		System.out.println("To:");
		to = s.nextInt();
		
		for(int number = from; number <= to; number++) {
			long factorial = 1;
			for(int i = 2; i <= number; i++) {
				factorial *= i;
			}
			System.out.printf("%d! = %d\n", number, factorial);
		}
	}

}
