/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class LastThreeLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.printf("Please enter a string, at least 3 letters long: ");   
     String s = in.next();
     int length = s.length();
     int length1 = length - 3;
     String ending =  s.substring(length1,length);
     System.out.printf("The last three letters are %s.\n", ending);
     
   
    }
    
    
}
