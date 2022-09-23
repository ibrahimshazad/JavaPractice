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
public class VowelStart {
 public static boolean startsWithVowel(String word)
  {
      String a=word.toLowerCase();
     
      if(a.charAt(0)=='a'||a.charAt(0)=='i'||a.charAt(0)=='e'||a.charAt(0)=='o'||a.charAt(0)=='u')
          return true;
      else 
          return false;
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
    while (true)
    {
      System.out.printf("Enter some word, or q to quit: ");
      String word = in.next();
      if (word.toLowerCase().equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      
      boolean result = startsWithVowel(word);
      if (result == true)
      {
        System.out.printf("Yes, %s starts with a vowel.\n\n", word);
      } 
      else
      {
        System.out.printf("No, %s does not start with a vowel.\n\n", word);
      }
    }
      
    }
    
}
