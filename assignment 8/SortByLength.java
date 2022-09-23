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

public class SortByLength
        
{
    public static void insertBeforeLonger(ArrayList<String> output_list,String item)
    {     
        boolean ins=false;
            
            for(int s=0;s<output_list.size();s++)
            {
              if(output_list.get(s).length()>item.length())
              {
                  ins=true;
               output_list.add(j,item);
               break;
              }
              
            }
            if(ins==false)
                output_list.add(item);
    }
    public static ArrayList<String> sortByLength(ArrayList<String>input_list)
    {
        
        ArrayList<String>output_list=new ArrayList();
      for(int k=0;k<input_list.size();k++)
      {
          insertBeforeLonger(output_list,input_list.get(k));
      }
      return output_list;
    }
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
      System.out.printf("Failed to open file %s\n",
                        filename);
      return null;
    }

    ArrayList<String> result = new ArrayList<String>();
    while(input_file.hasNextLine())
    {
      String line = input_file.nextLine();
      result.add(line);
    }
    
    input_file.close();
    return result;
  } 

  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.printf("Please enter the name of the input file: ");
    String filename = in.nextLine();
    ArrayList<String> input_list = readFile(filename);
    if (input_list == null)
    {
      System.out.printf("Exiting...\n");
      System.exit(0);
    }
    
    ArrayList<String> output_list = sortByLength(input_list);
    System.out.printf("Input:  ");
    System.out.println(input_list);
    System.out.printf("Output: ");
    System.out.println(output_list);  
  }

}
