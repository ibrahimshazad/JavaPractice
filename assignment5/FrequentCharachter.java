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
public class FrequentCharachter 

  {
  public static int countOccurrences(String text, char a)
  {
      int counter=0;
      for (int i=0;i<text.length();i++)
      {
          char c1=text.charAt(i);
          if(a==c1)
              counter++;
             
      }
      
      return counter;
  }
    public static char mostFrequentCharacter(String text)
  {
    int max_counter = 0;
    char max_char = 'a'; 
    
    for (int i = 0; i < text.length(); i++)
    {
      char current = text.charAt(i);
      int counter = countOccurrences(text, current);
      if(counter>=max_counter)
      {
          max_counter=counter;
          max_char=text.charAt(i);
      }

     

    }
    return max_char;
  }
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    
    while (true)
    {
      System.out.printf("Enter some text, or q to quit: ");
      String text = in.nextLine();
      if (text.toLowerCase().equals("q"))
      {
        break;
      }
      if (text.length() == 0)
      {
        break;
      }
      
      char a = mostFrequentCharacter(text);
      int number = countOccurrences(text, a);
      System.out.printf("Most frequent character: '%c'\n", a);
      System.out.printf("Number of occurrences of '%c': %d\n\n", a, number);
    }
    System.out.printf("Exiting...\n");
  }
}

    
    

