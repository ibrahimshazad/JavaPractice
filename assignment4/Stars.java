/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class Stars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     System.out.printf("Enter a positive integer N > 0: ");
     int N = in.nextInt();
     if (N>0)
     {
         for (int i = 0; i<N;i++)
         {
             for (int j = 0;j <= i; j++)
                 System.out.print("*");
         System.out.println("");
         }
          System.out.printf("Exiting...\n");
     }
     else     
     {
         System.out.printf("Exiting...\n");
     }
}
        
        
}
   
