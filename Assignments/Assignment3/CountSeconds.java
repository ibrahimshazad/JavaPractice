/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class CountSeconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   System.out.printf("Please specify the number of seconds (between 1 and 86400):");
   int s = in.nextInt();
   int hours = (s / 3600);
   int Rhours = (s % 3600);
   int minutes = (Rhours / 60);
   int Rmin = (Rhours % 60);
   int sec = (Rmin % 60);
   if ((s >= 1) && (s <= 86400))
   {
       System.out.printf(" %d seconds correspond to %d hours, %d minutes, and %d seconds.\n",s,hours,minutes,sec);
   }
   else 
   { 
       System.out.printf("The number of seconds must be between 1 and 86400\n.");
   }
       
 
   
    }
    }
