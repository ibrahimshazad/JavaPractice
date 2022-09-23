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
public class Middles {

    public static double pickMiddle(double first, double second, double third)
    {
        if(first>=second &&first>=third && third>=second)
        {
            return third;
        }
        else if (first>=second&& first>=third && second>=third)       
        {   return second;}
        
        else if(second>=first && second>=third && first>=third)
        {       return first;}
        
        else if(second>=third && second>=first && first<=third)
        {   return third;}
        
        else if (third>=first && third>=second && first>=second)
        {return first;}
        
        else if(third>=second && third >=second && second>=first)
        {   return second;}
        else 
            return 0;
    }
    public static double userDouble(String message)
  {
    Scanner in = new Scanner(System.in);
    double result=0;
    while (true)
    {
      System.out.printf(message);
      String s = in.next();
      if (s.toLowerCase().equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      try
      {
          result=Double.parseDouble(s);
        
      }
      catch(Exception e)
      {
          System.out.printf("%s is not a valid double \n", s);
      }
      return result;

         
  }
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true)
    {
      double first = userDouble("please enter the first number, or q to quit: ");
      double second = userDouble("please enter the second number, or q to quit: ");
      double third = userDouble("please enter the third number, or q to quit: ");
      double middle = pickMiddle(first, second, third);
      System.out.printf("the middle value is %.1f\n\n", middle);
    }

    }
    
}

