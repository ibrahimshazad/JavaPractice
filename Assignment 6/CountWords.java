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
public class CountWords {
public static int countWords(String text){
      
         int result = 1;
       for (int i=0; i<text.length();i++) {
           char a = text.charAt(i);
           
           if (a==' ' && text.charAt(i+1)!=' ')
               result++;
       }
       return result;
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
        break;
      }
      int result = countWords(text);
      System.out.printf("Counted %d words.\n\n", result);
    }

    }
    
}
