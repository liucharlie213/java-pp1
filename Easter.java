/**
 * This program implements the algorithm created by Fredrich Gauss 
 * for determining the date of Easter
 * 
 * @author: Charlie Liu CRL2157
 * @date: 02/03/22
 */

import java.util.Scanner;

public class Easter{
  
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year as an integer");
        int y = input.nextInt();

        int a = y%19;
        int b = y/100;
        int c = y%100;
        int d = b/4;
        int e = b%4;
        int g = (8*b + 13)/25;
        int h = (19*a + b - d - g + 15)%30;
        int j = c/4;
        int k = c%4;
        int m = (a + 11*h)/319;
        int r = (2*e + 2*j - k - h + m + 32)%7;
        int n = (h - m + r + 90)/25;
        int p = (h - m + r + n + 19)%32;
        
        String month = " "; 
        // declares and initializes variable month 
        if (n == 3){
            month = "March";
        }

        if (n == 4){
            month = "April";
        }
        // Easter can only occur in March or April

        System.out.println("In " + y + ", Easter falls on " + month + " " + p);

    }





}	
