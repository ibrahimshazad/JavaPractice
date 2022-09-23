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
import java.io.*;


public class q25 {
    public static void print_combinations(String[] array1, String[] array2)
  {
    for (int i = 0; i < array1.length; i++)
    {
      for (int j = 0; j < array2.length; j++)
      {
        System.out.printf("%s %s\n", array1[i], array2[j]);
      }
    }
  }
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String[] a1 = {"red", "white", "green", "blue"};
    String[] a2 = {"shirt", "pants", "shoes"};
    print_combinations(a1, a2);

    }
    
}
