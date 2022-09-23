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
public class RepeatLetters {
public static void repeatLetters(String text, int times){
      for (int i = 0; i<text.length();i++) 
      {
          for (int a=0; a<times;a++)
          {
              char b = text.charAt(i);
              System.out.printf("%s",b);
          }
      }   
  }
  public static int userInteger(String message)
  {
    Scanner in = new Scanner(System.in);
    int result;
    while (true)
    {
      System.out.printf(message);
      String s = in.next();
      if (s.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      
      try
      {
        result = Integer.parseInt(s);
      } 
      catch (Exception e)
      {
        System.out.printf("%s is not a valid number, try again.\n\n", s);
        continue;
      }
      
      if (result <= 0)
      {
        System.out.printf("%s is <= 0, try again.\n\n", s);
        continue;
      }
      return result;
    }
  }
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
    while (true)
    {
      System.out.printf("Enter some text, or q to quit: ");
      String text = in.nextLine();
      if (text.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      
      int times = userInteger("Enter number of times (must be > 0): ");
      
      repeatLetters(text, times);
      System.out.printf("\n\n");
    }

    }
    
}
