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
public class LetterSorting {
public static String sortLetters(String text)
{
    
text=text.toLowerCase();
String result="";
String legal="abcdefghijklmnopqrstuvwxyz";

    
        for(int k=0;k<legal.length();k++)
        {
        for(int i=0;i<text.length();i++)
        {
        
           char c=text.charAt(i);
       char c1=legal.charAt(k);
       
       if(c==c1){
           result+=c;
          
       }
    }
        
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
      if (text.toLowerCase().equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      
      String result = sortLetters(text);
      System.out.printf("Result: %s.\n\n", result);
    }

    }
    
}
