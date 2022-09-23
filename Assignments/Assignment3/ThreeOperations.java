/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class ThreeOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter real number N1:");
        double N1 = in.nextDouble();
        System.out.printf("Please enter real number N2:");
        double N2 = in.nextDouble();
        double N3 = N1 * N2;
        double N4 = N1 / N2;
        double N5 = Math.pow(N1, N2);
         System.out.printf(" %.2f * %.2f = %.2f\n",N1,N2,N3);
         System.out.printf(" %.2f / %.2f = %.2f\n",N1,N2,N4);
         System.out.printf(" %.2f raised to the power of %.2f = %.2f\n",N1,N2,N5);
          
        

        
        
    
    }
    
    
    
}
