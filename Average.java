/**
 * This program accepts a series of positive intergers
 * and reports their average
 * 
 * @author: Charlie Liu CRL2157
 * @date: 1/30/22
 */
import java.util.Scanner;
public class Average {
     public static void main(String[] args) {
          System.out.println("Please enter a value: ");
          Scanner input = new Scanner(System.in);
          int value = input.nextInt();
          double sum = 0;
          int i = 0;
          // i acts as a counter variable
          // counts how many values are entered
          
          if (value == -1){
               System.out.println("-1 entered first, no average computed");
               // of -1 is the first value entered, no values will be read in 
          } 
          
          else {
                while (value != -1) {
               // -1 is a marker to stop
                    i++;
                    // if value is -1, will not add to counter (non-inclusive for -1)
                    sum += value;
                    
                    System.out.println("Please enter a value: ");
                    input = new Scanner(System.in);
                    value = input.nextInt();
               // allows user to keep adding/inputing values until they enter -1 
               } 
               System.out.println("The average of the numbers you input is: " + sum/(i));
          }

     }
}