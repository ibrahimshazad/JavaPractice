
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
public class evenOdds {

    public static String evenodds(String str)
{
    int a;
    String string1 = "", og = "", string2 = "";
    for (int i = 0 ; i < str.length() ; i++)
    {
        String Sub = str.substring(i,i+1);
        try 
        {
            a = Integer.parseInt(Sub);
        }
        catch (Exception e)
        {
            continue;
        }
        if (a % 2 == 0)
        {
           string1 += a;
        }
        else
        {
            string2 += a;
        }
       
    }
    
        int size = string1.length();
        
        for (int j = size -1 ; j >=0; j--)
        {
            
            og = og + string1.charAt(j);
          }
        og = og + string2;
        
        System.out.printf("%s",og);
        
    return og;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String a = evenodds("012345");

       
    }
    
}
