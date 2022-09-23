/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */import java.util.Scanner;
public class SkipMultiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
  System.out.printf("Enter low: ");
  int low = in.nextInt();
  System.out.printf("Enter high: ");
  int high = in.nextInt();
   if (low<=high)
   {
       for(int i = low;i<=high;i++)
       {
           if(i%4==0 && i<high)
           {
               System.out.printf("%d\n",i+1);
               i++;
               continue;
           }
           else if (i<high)
           {
               System.out.printf("%d\n",i);
           }
       }
   }
   else if (low>high)
   {
       System.out.printf("no numbers found\n");
               
           }
       }
   }
  
    
    
    
    

