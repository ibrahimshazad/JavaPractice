/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
public class ArraySquare {
 public static double[] arraySquare(double[]X)
    {
        double[] result=new double[X.length];
        for(int i=0;i<X.length;i++)
        {
            result[i]=Math.pow(X[i], 2);
        }
        return result;
    }
 public static void printDoubleArray(String name, double[] a)
  {
    System.out.printf("%20s: ", name);
    if (a == null)
    {
      System.out.printf("Null array!\n\n");
      return;
    }
    
    for (int i = 0; i < a.length; i++)
    {
      System.out.printf("%7.2f", a[i]);
    }
    System.out.printf("\n");
  }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
double[] a = {3.2, 2.1, 5.3, 8.0, 4.9, 5.7};
    double[] b = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
      
    double[] result = arraySquare(a);
    printDoubleArray("a", a);
    printDoubleArray("arraySquare(a)", result);

    result = arraySquare(b);
    System.out.printf("\n");
    printDoubleArray("b", b);
    printDoubleArray("arraySquare(b)", result);
    }
    
}
