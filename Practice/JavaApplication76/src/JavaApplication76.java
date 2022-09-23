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

public class JavaApplication76 
{
  public static int[] search(int[][] a, int val)
  {
    int[] result = {-1, -1};
    for (int c = 0; c < a[0].length; c++)
    {
      for (int r = 0; r < a.length; r++)
      {
        if (a[r][c] == val)
        {
          result[0] = r;
          result[1] = c;
          return result;
        }
      }
    }
    
    return result;
  }
  
  public static ArrayList<Integer> searchAll(int[][] a, int val)
  {
    ArrayList<Integer> result = new ArrayList();
    
    for (int c = 0; c < a[0].length; c++)
    {
      for (int r = 0; r < a.length; r++)
      {
        if (a[r][c] == val)
        {
          ArrayList<Integer> row = new ArrayList();
          row.add(r);
          row.add(c);
          result.add(row);
        }
      }
    }
    
    return result;
  }
  
  public static void printArr(int[] a)
  {
    System.out.printf("[");
    for (int i = 0; i < a.length-1; i++)
    {
      System.out.printf("%d, ", a[i]);
    }
    System.out.printf("%d]\n", a[a.length-1]);
  }
    
  public static void main(String[] args) 
  {
    int[][] a = {{1, 12, 19},
                 {-1, 7, 3},
                 {3, -100, 1000}};
  
  }
}
   
    

