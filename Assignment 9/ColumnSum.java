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
import java.io.File;

public class ColumnSum
{
  public static int userInteger(String m)
  {
    Scanner in = new Scanner(System.in);
    int result;
    while (true)
    {
      System.out.printf(m);
      String sk = in.next();
      if (sk.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      
      try
      {
        result = Integer.parseInt(sk);
      } 
      catch (Exception e)
      {
        System.out.printf("%s is not a valid number, try again.\n\n", sk);
        continue;
      }
      
      return result;
    }
  }  
  
  public static ArrayList<String> readfile(String filename)
    {
        File temp =new File(filename);
        Scanner input;
        try{
            input= new Scanner (temp);
            
        }
        catch (Exception e)
        {
            System.out.printf("Failed to open file %s \n", filename);
            return null;
            
        }
        ArrayList<String> result= new ArrayList();
        while(input.hasNextLine())
        {
            String line=input.nextLine();
            result.add(line);
        }
        input.close();
        return result;
    }
    public static String [][] readSpreadsheet(String filename)
    {
        ArrayList<String> lines= readfile(filename);
        if(lines==null)
            return null;
        int rows= lines.size();
        String [][]result= new String[rows][];
        for(int i=0;i<lines.size();i++)
        {
            String line=lines.get(i);
            String []values=line.split(",");
            result[i]=values;
        }
        return result;
    }
  
   
    public static double columnSum(String filename, int c)
    {
               double sum=0;
                double w=0;
                String [][]lines=readSpreadsheet(filename);
                if(lines==null)
                {  
                   return -1;
                } 
                for(int i=1;i<lines.length;i++)
                {
                    if(lines[i].length<c)
                        continue;
                    try{
                       
                       w=Double.parseDouble(lines[i][c]);
                    }
                    catch(Exception e)
                    {
                        continue;
                    }
                    sum+=w;
                   
                }
                
                
    
           return sum;        
    }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    while (true)
    {
      System.out.printf("Enter a filename (or q to quit): ");
      String filename = in.next();
      if (filename.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      int column = userInteger("Enter a column: ");
      
      double sum = columnSum(filename, column);
      System.out.printf("In file %s, column %d has sum %.2f\n\n",
                        filename, column, sum);
    }
  }
}

