/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class Numerion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
    System.out.printf("Enter an integer N: ");
    int N = in.nextInt();
    boolean NFound = false;
    for (int i = 1; i <= N; i++)
    {
      if (N == i*i+i)      {
        NFound = true;
      }
     
    }
    
    if (NFound)   {
      System.out.printf("%d is a holy number in Numerion.\n", N);
    }
    else   {
      System.out.printf("%d is not a holy number in Numerion.\n", N); 
    }
   System.out.printf("Exiting...\n"); 
 
   

         

    }
    
}
