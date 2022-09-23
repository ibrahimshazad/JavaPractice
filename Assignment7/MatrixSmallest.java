/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
public class MatrixSmallest {
public static double[][] matrixSmallest(double[][]X, double[][]Y)
 {if(X.length!=Y.length)
     return null;
     double[][]result= new double[X.length][X[0].length];
         for(int i=0;i<X.length;i++){
             if(X[i].length!=Y[i].length)
                 return null;
     
         for(int j=i;j<X[i].length;j++)
         {
             if(X[i][j]<Y[i][j])
                 result[i][j]=X[i][j];
             else
                 result[i][j]=Y[i][j];
         }
     }
     return result;
 }
 public static void printDoubleMatrix(String name, double[][] a)
  {
    if (a == null)
    {
      System.out.printf("%s: null\n", name);    
      return;
    }
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
                     {8.0, 4.9, 5.7} };
    double[][] b = { {1.1, 2.2, 3.3}, 
                     {4.4, 5.5, 6.6} };
      
    double[][] result = matrixSmallest(a, b);
    printDoubleMatrix("a", a);
    printDoubleMatrix("b", b);
    printDoubleMatrix("result", result);

    }
    
}
