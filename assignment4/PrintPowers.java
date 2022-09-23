/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class PrintPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     System.out.printf("Enter a positive integer N > 1: ");
     int N = in.nextInt();
  
  for(int i = 0; N>1; i++)
      { 
     double k = Math.pow(N,i);
     if (k<=40000)
    System.out.printf("%.0f\n",k); 
     else 
         break;
    }
       System.out.printf("Exiting...\n"); 
      }
}
    
