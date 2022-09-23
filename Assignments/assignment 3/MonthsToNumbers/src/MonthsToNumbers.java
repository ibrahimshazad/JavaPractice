/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class MonthsToNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
     System.out.printf("Please enter the name of a month: ");
     String s = in.next();
     String s1 = s.toLowerCase();
     if (s1.equals("january")) {
            System.out.printf("January is the first month.\n");
        } else if (s1.equals("january")) {
            System.out.printf("febuary is the second month.\n");
        } else if (s1.equals("march")) {
            System.out.printf("March is the third month.\n");

        } else if (s1.equals("april")) {
            System.out.printf("April is the fourth month.\n");

        } else if (s1.equals("may")) {
            System.out.printf("May is the fifth month.\n");

        } else if (s1.equals("june")) {
            System.out.printf("June is the sixth month.\n");

        } else if (s1.equals("july")) {
            System.out.printf("July is the seventh month.\n");

        } else if (s1.equals("august")) {
            System.out.printf("August is the eigth month.\n");

        } else if (s1.equals("september")) {
            System.out.printf("September is the ninth month.\n");

        } else if (s1.equals("october")) {
            System.out.printf("October is the tenth month.\n");

        } else if (s1.equals("november")) {
            System.out.printf("November is the eleventh month.\n");

        } else if (s1.equals("december")) {
            System.out.printf("December is the twelfth month.\n");
        }  else {
             System.out.printf(" Unknown month: %s\n",s); 
     
     
        }
    }
}
    
        
    
            

