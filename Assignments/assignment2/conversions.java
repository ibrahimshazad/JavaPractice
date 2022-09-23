/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;

public class conversions {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
System.out.printf("Enter a number: ");
double a = in.nextDouble();
int a1 = (int) a;
int a2 = (int) Math.round(a);
int a3 = (int) Math.floor(a);
int a4 = (int) Math.ceil(a);
System.out.printf("a cast into an int becomes %d\n", a1);
System.out.printf("a rounded becomes %d\n ", a2);
System.out.printf("The floor of a is %d\n ", a3);
System.out.printf("The ceiling of a is %d\n ", a4);

    }
    
}
