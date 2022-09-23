/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
import java.io.File;
import java.util.*;
public class SumIntegers {

    /**
     * @param args the command line arguments
     */
    public static int sumIntegers(String filename)
    {
        int d = 0;
        int sum = 0; 
        ArrayList<String> a = readFile(filename);
        if (a== null)
            {
          System.out.printf("Failed to open file %s\n");
      }
      for (int i = 0; i<a.size();i++)
      {
          String line = a.get(i);
          try
          {
              d= Integer.parseInt(line);
          }
          catch(Exception e)      
          {
              continue;
          }
          sum+=d;
      }
      return sum;
    }
    
    
    
    
     public static ArrayList<String> readFile(String filename)
  {
    File temp = new File(filename);
    Scanner input;
    try
    {
      input = new Scanner(temp);
    }
    catch (Exception e)
    {
      System.out.printf("Failed to open file %s\n",
                        filename);
      return null;
    }

    ArrayList<String> result = new ArrayList<String>();
    while(input.hasNextLine())
    {
      String line = input.nextLine();
      result.add(line);
    }
    
    input.close();
    return result;
  }
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
    System.out.printf("Please enter the name of the input file: ");  
    String filename = in.nextLine();
 
    int result = sumIntegers(filename);
    System.out.printf("result = %d.\n", result);

    }
    
}
