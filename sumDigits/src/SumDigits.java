/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
public class SumDigits {
 public static int sumDigits(String text)
 {
     int sum = 0;
     int a = 0;
      for (int i = 0; i<text.length(); i++)
      {
          String line = text.substring(i,i+1);
           try 
           {
          a = Integer.parseInt(line);
           }
           catch (Exception e)
           {
               continue;
           }
            sum += a;
      }
     return sum;
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num = sumDigits("CSE");
       System.out.printf("%d\n",num);
    }
    
}
