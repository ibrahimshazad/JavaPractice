/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class Sentences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the first noun: ");
        String s = in.next();
        System.out.printf("Enter the second noun: ");
        String s1 = in.next();
        System.out.printf("Enter a verb: ");
        String s2 = in.next();
        System.out.printf("The %s %s over the %s.\n",s,s2,s1);
    }
    
}
