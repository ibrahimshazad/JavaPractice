/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class MarchSundays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.printf("When is the first Sunday this March? ");
    int date = in.nextInt();
    if (date>=1 && date<=7){
    System.out.printf("This March, Sundays fall on:\n");
    for (int i = date; i <= 31; i+=7)
     {
     System.out.printf("March %d\n",i);
     }
    } else if (date<1 || date>7){
       System.out.printf("inavlid entry\n"); 
    }
       
    }
    
}
