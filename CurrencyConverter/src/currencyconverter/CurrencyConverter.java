/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;

import java.util.Scanner;

/**
 *
 * @author inf2067_usr
 */
public class CurrencyConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String currency;
        double amount;
        double usdToBgn = 1.72;
        double eurToBgn = 1.9558;
        double jpyToBgn = 0.016196;
        double result;
        
        System.out.println("Select a currency: ");
        currency = s.next();
        System.out.println("Amount: ");
        amount = s.nextDouble();
        
        if(amount <= 0){
            System.out.println("Only positive amounts!");
            return;
        }
        if(currency.equalsIgnoreCase("USD")){
            result = amount * usdToBgn;
        } else if(currency.equalsIgnoreCase("EUR")){
            result = amount * eurToBgn;
        } else if(currency.equalsIgnoreCase("JPY")){
            result = amount * jpyToBgn;
        } else{
            System.out.println("No such currency");
            return;
        }
        System.out.printf("%.2f %s are %.2f leva\n",
                amount, currency, result);
    }
    
}
