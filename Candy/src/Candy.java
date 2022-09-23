/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
import java.util.*;
import java.util.ArrayList;
public class Candy {

    public static ArrayList<Integer> sumcandy(int [][] candyjar)
    {
        int total = 0 ;
        int total1 = 0 ;
        int total2 = 0 ;
        int total3 = 0 ;
        int total4 = 0 ;
        ArrayList<Integer> sum =  new ArrayList<Integer>
           
              for(int j = 0; j<candyjar.length;j++)
             {
                  total += candyjar[0][j];
                 total1 += candyjar[1][j];
                 total2 += candyjar[2][j];
                 total3 += candyjar[3][j];
                 total4 += candyjar[4][j];
                
             }
              sum.add(total);
              sum.add(total1);
              sum.add(total2);
              sum.add(total3);
              sum.add(total4);
              return sum;
         }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
