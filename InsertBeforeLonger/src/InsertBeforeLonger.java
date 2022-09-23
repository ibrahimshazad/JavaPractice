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
import java.util.ArrayList;


        

public class InsertBeforeLonger {
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
      while (input_file.hasNextLine());
        {
String line = input_file.nextLine();
        result.add(line);
        }
        input_file.close();
        return result;
  }
public static void InsertBeforeLonger(ArrayList<String> out , String item)
{
    
    boolean a = false;
    
    for ( int i = 0; i<out.size(); i++)
    {
        if (out.get(i).length()>item.length())
        {
            a = true;
            out.add(i,item);
            break;
        }
    }
    if(a == false)
        out.add(item);
    ;
         
    
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
    
    System.out.printf("Please enter the name of the input file: ");
    String filename = in.nextLine();
    ArrayList<String> input_list = readFile(filename);
    if (input_list == null)
    {
      System.out.printf("Exiting...\n");
      System.exit(0);
    }
    
    ArrayList<String> out = new ArrayList<String>();
    for (int i = 0; i < input_list.size(); i++)
    {
      String item = input_list.get(i);
      InsertBeforeLonger(out, item);
      System.out.println(out);
    }  
  }

    
    
}
