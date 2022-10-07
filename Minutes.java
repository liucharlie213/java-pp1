/**
 * This program converts a number of days and weeks into the
 * equivalent number of minutes
 * 
 * @author: Charlie Liu
 * @date: 02/02/22
 */

import java.util.Scanner;

public class Minutes{
    
    public static void main(String[] args){
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter a number of days");
        int days = input1.nextInt();
        // takes in integer input from user
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter a number of weeks");
        int weeks = input2.nextInt(); 

        int weeksToDays = weeks*7;
        int totalDays = days + weeksToDays; 
        // gets total number of days inputed

        int hrs = totalDays*24;
        int mins = hrs*60;
        // calculates how many minutes 
        System.out.println(days + " day(s) and " + weeks + " week(s) is " + mins + " minutes");
    }
}
 