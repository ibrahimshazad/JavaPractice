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
public class Years {

    public static boolean isLeapYear(int year)
    {
        if(year%4==0)
            return true;
        else 
            return false;
    }
  public static int userInteger(String message)
  {
    Scanner in = new Scanner(System.in);
    int result=0;
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
          result=Integer.parseInt(s);
          
      }
      catch(Exception e)
      {
          System.out.printf("%s is not a valid integer \n", s);
      }
      if(result>0)
          return result;
      else if(result<=0)
          System.out.printf("%s is not >=1 \n", s);
      
    }
  }
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            while (true)
    {
      int year = userInteger("Please enter a year >= 1, or q to quit: ");
      boolean result = isLeapYear(year);
      if (result == true)
      {
        System.out.printf("Yes, %d is a leap year.\n\n", year);
      } 
      else
      {
        System.out.printf("No, %d is not a leap year.\n\n", year);
      }
    }

    }
    
}
