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

public class CountMultiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter an integer M: ");
        int M = in.nextInt();
        System.out.printf("Enter an integer N: ");
        int N = in.nextInt();
        int num = 0;
        if (M < N) 
       
        {
        for (int i = M; i<=N;i++)
            {
            if(i%11==0)
            {
            num++;
            }
            

        }
 System.out.printf("%d numbers between %d and %d are multiples of 11.\n",num,M,N);
    System.out.printf("Exiting...");
        }
        else 
            System.out.printf("Exiting...");
    
    }
}