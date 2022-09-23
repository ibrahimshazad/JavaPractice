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
import java.io.PrintWriter;

public class ReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File temp = new File("hello.txt");
       Scanner fin;
       try 
       {
           fin = new Scanner(temp);
       }
       catch(Exception e)
       {
           exit;
       }
    while(fin.hasNextLine())
    {
        String line = fin.nextLine();
        String [] data = line.split(",");
        if(data[1].equals(dest))
        {
    }
    
    }
    fin.close();
}
