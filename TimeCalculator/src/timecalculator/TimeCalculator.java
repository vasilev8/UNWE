/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalculator;

import java.util.Scanner;

/**
 *
 * @author hrist
 */
public class TimeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double sec;
        System.out.print("How many seconds? ");
        sec = s.nextDouble();
        double minutes;
        minutes = sec / 60;
        System.out.printf("Minutes: %f\n", minutes);
        double hours;
        hours = minutes / 60;
        System.out.printf("Hours: %f\n", hours);
        double days;
        days = hours / 24;
        System.out.printf("Days: %f\n", days);
        double weeks;
        weeks = days / 7;
        System.out.printf("Weeks: %f\n", weeks);
        double years;
        years = weeks / 52.177457;
        System.out.printf("Years: %f\n", years);
        
    }
    
}
