/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
import java.util.*;
public class Maxcol {

    
    public static int [][] Creation(int maxcol , int value)
    {
          
        
        int [][] matrix = new int[maxcol][maxcol];
        int sum = 0;
            
        for (int i = 0;i<maxcol;i++)
        {
        for (int j = 0; j<maxcol;j++)
            {
            matrix [i][j] = value+sum;
            sum = sum + value;
            }
            }
        return matrix;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter number bc:");
        int maxcol = in.nextInt();
        System.out.printf("Enter value bc:");
        int value = in.nextInt();
        int [][] k = Creation(maxcol,value);
        
      
       
       for (int a = 0;a<maxcol;a++)
        {
        for (int b = 0; b<maxcol;b++)
        {
       k[a][b]= k[a][b]*k[a][b];
        System.out.printf(k[a][b] + " ");
        }
        System.out.println();
    }
        }

    }
    

