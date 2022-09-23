/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */ import java.util.Scanner;
public class FourCapitalizations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.printf("Please enter a string:  "); 
         String s = in.nextLine();
         String s1 = s.toUpperCase();
         String s2 = s.toLowerCase();
         String sub = s.substring(0, 1);
         sub = sub.toUpperCase();
         int length = s.length();
         String s3 = sub + s.substring(1,length);
         System.out.printf("1st version: %s\n", s);
         System.out.printf("2nd version: %s\n", s1);
         System.out.printf("3rd version: %s\n", s2);
         System.out.printf("4th version: %s\n", s3);
         
         
         
          
         
    }
    
}
