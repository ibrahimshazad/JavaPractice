/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
import java.util.Scanner;
public class CountDigits {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter an integer: ");
         int s = in.nextInt();
         int length = String.valueOf(s).length();
         if (s < 0) 
            {
            System.out.printf("%d is negative.\n",s);
             } 
         else if (s >0 && s<= 1000000) 
         {
            System.out.printf("%d has %d digits.\n",s,length);
         } 
         else if (s == 0 ) 
         {
            System.out.printf("%d has one digit.\n",s);
         } 
         else 
         {
         System.out.printf("%d has more than six digits.\n",s);
             }
      }
        
    }


