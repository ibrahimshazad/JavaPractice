/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class ThreeWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter an integer N:");
                 int N = in.nextInt();
                 System.out.printf("Please enter a word with at least %d and at most 20 letters :",N);
                 String s = in.next();
                 System.out.printf("Please enter a second word with at least %d and at most 20 letters :",N);
                 String s1 = in.next();
                 System.out.printf("Please enter a third word with at least %d and at most 20 letters :",N);
                 String s2 = in.next();
                 String one = s.substring(0,N);
                 String two = s1.substring(0,N);
                 String three = s2.substring(0,N);
                 System.out.printf("%s starts with %s\n",s,one);
                 System.out.printf("%s starts with %s\n",s1,two);
                 System.out.printf("%s starts with %s\n",s2,three);
                 
    }
    
}
