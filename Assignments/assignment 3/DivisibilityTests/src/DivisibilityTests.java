/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class DivisibilityTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.printf("Please enter an integer: ");
       int s = in.nextInt();
       if (s<0)
       { System.out.printf("The number is negative.\n"); }
       
       else if ((s % 2 == 0 ) && (s % 3 == 0))
            { System.out.printf("The number is even and divisible by 3.\n"); }
       else if ((s % 2 == 0 ) && !(s % 3 == 0))
                   { System.out.printf("The number is even and not divisible by 3.\n"); }
       else if (!(s % 2 == 0 ) && (s % 3 == 0))
            { System.out.printf("The number is odd and divisible by 3.\n"); }
        else if (!(s % 2 == 0 ) && !(s % 3 == 0))
       { System.out.printf("The number is odd and not divisible by 3.\n"); }
            }
    
       
    }
    

