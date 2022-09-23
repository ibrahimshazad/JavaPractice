/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;

public class LengthSum {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
    System.out.printf("Please enter a string:");
    String first = in.next();
    System.out.printf("Please enter a second string:");
     String second = in.next();
     int length1 = first.length();
     int length2 = second.length();
     int length3 = length1 + length2;
     
    System.out.printf("The first string has length %d.\n", length1);
    System.out.printf("The second string has length %d.\n", length2);
    System.out.printf("The sum of the two lengths is %d.\n", length3);
    }
    
}
