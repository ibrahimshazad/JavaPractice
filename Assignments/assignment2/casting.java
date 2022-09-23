/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.printf("Please enter a double number: ");
    double a = in.nextDouble();
    int a1 = (int) a;
    System.out.printf("a cast into an int becomes %d.\n", a1);
    }
    
}
