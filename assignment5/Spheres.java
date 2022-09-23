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
public class Spheres {
public static double sphereVolume(double radius)
    {
        double result =  Math.pow(radius,3)* Math.PI * 4/3;
        return result;
    }
    public static double userDouble(String message)
  {
    Scanner in = new Scanner(System.in);
    double result =0;
   
    while (true)
    {
      System.out.printf(message);
      String s = in.next();
      
      if (s.toLowerCase().equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
        
        return result;
      }
      try
      {
        result = Double.parseDouble(s);
      } 
      catch (Exception e)
      {
        System.out.printf("%s is not a valid double.\n\n", s);
        continue;
      }
      
       if(result>0)
          
      {
          return result;
         
      }
      else if(result<0)
          System.out.printf("%s is not positive \n",s);
      else
          System.out.printf("%s is not a valid double \n",s);
      
    }
  }
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     while(true)
    {
      double r = userDouble("Please enter a radius >= 0, or q to quit: ");
      
      double volume = sphereVolume(r);
      System.out.printf("Volume = %.2f.\n\n", volume);
    }
 
    }
    
}
