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
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
public class CheckPrimes {

    public static ArrayList<String> fileread(String filename)
            {
                  File temp = new File(filename);
       Scanner fin;
       try 
       {
           fin = new Scanner(temp);
       }
       catch(Exception e)
       {
           System.out.printf(" Error in opening file ");
            return null;
       }
       ArrayList<String> result = new ArrayList();
       
    while(fin.hasNextLine())
    {
        String line = fin.nextLine();
        result.add(line);
    }
    fin.close();
    return result;
    }
    
    public static void checkPrimes(String infile , String outfile)
    {
        double numbers; 
        ArrayList<String> lines = fileread(infile);
        PrintWriter out = null;
        try 
        {
            out = new PrintWriter(outfile);
        }
        catch (Exception e)
        {
            System.out.printf("Error in opening file for writing");
            return;
        }
        
        for(int i = 0; i<lines.size();i++)
        {
            try
            {
                numbers= Double.parseDouble(lines.get(i));
            }
            catch (Exception e)
            {
                return;
            }
            boolean q = isPrime(numbers);
            if (q == true)
                out.printf(".0f is prime \n" ,numbers);
                else
             out.printf("%.0f is not prime \n",numbers);
        }
        out.close();
    }
    public static boolean isPrime(double numbers)
    {
             if (numbers < 2 )
                return false;
            else if (numbers <= 3)
                return true;
             boolean notPrime = true;
             
             for(int m = 2; m <= Math.sqrt(numbers); m++)
                     {
                 notPrime = (numbers % m == 0);
        if (notPrime)
            break;
    }

    return !notPrime;
}
    
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       checkPrimes("in4.txt", "out4.txt");
    System.out.printf("Exiting...\n");
    }
    
}
