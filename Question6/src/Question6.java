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
import java.util.ArrayList;
import java.io.File;
        
public class Question6 {

public static ArrayList<String> readFile(String filename)
  {
    File temp = new File(filename);
    Scanner input_file;
try 
{
input_file = new Scanner(temp);
}
catch (Exception e)
{
System.out.printf("Failed to open file %s\n", filename);
      return null;
}

ArrayList<String> result = new ArrayList<String>();
      while (input_file.hasNextLine());
        {
String line = input_file.nextLine();
        result.add(line);
        }
        input_file.close();
        return result;
  }
    
   public static void company(int r, String filename)
   {
       ArrayList<String> Company = readFile(filename);
      ArrayList<String> result = new ArrayList<String>();
       int ra = 0;
       for (int i = 0; i<Company.size();i++)
       {
          String line = Company.get(i);
          String [] tokens = line.split(",");
          String second = tokens[2];
          String ranks = second.substring(0,1);
       try{
           ra = Integer.parseInt(ranks);
       }
       catch (Exception e)
       {
           continue;
       }
      
          if (ra == r)
          {
              System.out.printf("-%s\n",tokens[0]);
          }
              
        
   }
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.printf("Welcome!\n");
       System.out.printf("Enter file name:");
       
       String filename= in.nextLine();
       readFile(filename);
       System.out.printf("Enter ranking to check for:");
       int rank= in.nextInt();
       company(rank,filename);
    }
    
}
