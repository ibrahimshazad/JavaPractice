/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class RemoveVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.printf("Enter a word: ");
     String s = in.next();
     int length = s.length();
      for (int i = 0; i <= length-1; i++)
      {
     char s1 = s.charAt(i);
     if (s1 == 'a' || s1 == 'e' || s1 == 'i' || s1 == 'o' || s1 == 'u' || s1 == 'A' || s1 == 'E' || s1 == 'I' || s1 == 'O' || s1 == 'U') {
            continue;
        } else {
         System.out.printf("%c", s.charAt(i));
     }   
      }
             System.out.printf("\n");
      System.out.printf("Exiting...\n", s);
        
    }
    
    
}
