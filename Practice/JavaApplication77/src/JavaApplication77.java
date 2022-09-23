/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
import java.util.Scanner;
import java.io.File;
import java.util.*;

public class JavaApplication77 {
public static void pass(String[][] data, String dest)
{
    for(int i = 0; i <data.length;i++)
    {
        if(data[i][1].equals(dest))
        {
            String [] name = data[i][0].split("");
            System.out.printf("-- %s,%s\n", name[1], name [0]);
            
        }
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Welcome..");
       System.out.printf("Enter the file name");
       String fn = in.nextLine();
       System.out.printf("enter the destination");
       String dest = in.nextLine();
       System.out.printf("list of travelers:");
       String [][] data = readFile(fn);
       pass(data,dest);
      }
    
}
