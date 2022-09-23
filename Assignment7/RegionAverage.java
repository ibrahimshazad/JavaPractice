/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
public class RegionAverage {
public static double regionAverage(double[][]X,int top, int bottom,int left, int right)
    {double result=0;
        double counter=0;
        for(int i=top; i<=bottom;i++)
        {
            for(int j=left;j<=right;j++)
            {
            result+=X[i][j];
            counter++;
            }
         
        }
     
        return result/counter;
    }
  public static void printDoubleMatrix(String name, double[][] a)
  {
    System.out.printf("%s:\n", name);    
    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < a[i].length; j++)
      {
        System.out.printf("%7.1f", a[i][j]);
      }
      System.out.printf("\n");
    }
    System.out.printf("\n");
  }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double[][] a = { {3.2, 2.1, 5.3},
                     {8.0, 4.9, 5.7},
                     {18.0, 14.9, 15.7},
                     {28.0, 24.9, 25.7},
                     {38.0, 34.9, 35.7} };
      
    printDoubleMatrix("a", a);
    double result = regionAverage(a, 0,3, 1, 2);
    System.out.printf("regionAverage(a, 0, 3, 1, 2) returned %.2f.\n", result);
    result = regionAverage(a, 2, 4, 0, 2);
    System.out.printf("regionAverage(a, 2, 4, 0, 2) returned %.2f.\n", result);
    }
    
}
