/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
public class PickLargest {
public static double[] pickLargest(double []X, double []Y)
  {if(X.length!=Y.length)
      return null;
      double[] result = new double[X.length];
      for(int i=0;i<X.length;i++)
      {
          
          if(X[i]>Y[i])
          {
              result[i]=X[i];
          }
          else
              result[i]=Y[i];
              
      }
      return result;
  }
    
    public static void printDoubleArray(String name, double[] a)
  {
    System.out.printf("%7s: ", name);
    if (a == null)
    {
      System.out.printf("Null array!\n\n");
      return;
    }
    
    for (int i = 0; i < a.length; i++)
    {
      System.out.printf("%7.1f", a[i]);
    }
    System.out.printf("\n");
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double[] a = {3.2, 2.1, 5.3, 8.0, 4.9, 5.7};
    double[] b = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
      
    double[] result = pickLargest(a, b);
    printDoubleArray("a", a);
    printDoubleArray("b", b);
    printDoubleArray("result", result);
    }
    
}
