/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
public class ArrayMerge {
public static String[] arrayMerge(String[]X,String[]Y)
    {
            String[] result=new String[X.length+Y.length];
            int pos=0;
            for(int i=0;i<X.length;i++)
            {
                result[pos]=Y[i];
                pos++;
            }
            for(int j=0;j<X.length;j++)
            {
               
                result[pos]=Y[j];
              pos++;
            }            
            return result;
    }
    /**
     * @param args the command line arguments
     */
     public static void printStringArray(String name, String[] a)
  {
    System.out.printf("%7s: ", name);
    if (a == null)
    {
      System.out.printf("Null array!\n\n");
      return;
    }
    
    for (int i = 0; i < a.length; i++)
    {
      System.out.printf("%12s", a[i]);
    }
    System.out.printf("\n");
  }
  
  public static void main(String[] args)
  {
    String[] a = {"Chicago", "New York", "Dallas"};
    String[] b = {"Berlin", "London", "Paris", "Rome"};
      
    String[] result = arrayMerge(a, b);
    printStringArray("a", a);
    printStringArray("b", b);
    printStringArray("result", result);
  }
}
    
    

