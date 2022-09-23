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
public class PrintCoded {
public static void printCoded(String word,String sources, String targets) {
       
        for (int i = 0; i<word.length();i++)
        {
            char a = word.charAt(i);
            int b= sources.indexOf(a);
            if (b>=0)
            {
                char c = targets.charAt(b);
                System.out.printf("%s", c);
            }
            else 
            {
                System.out.printf("%s", a);
            }
        }  
 }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
    
    String sources = "abcdefghijklmnopqrstuvwxyz";
    String targets = "bcdefghijklmnopqrstuvwxyza";
    
    while (true)
    {
      System.out.printf("Enter some word, or q to quit: ");
      String word = in.next();
      if (word.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      printCoded(word, sources, targets);
      System.out.printf("\n\n");
    }

    }
    
}
