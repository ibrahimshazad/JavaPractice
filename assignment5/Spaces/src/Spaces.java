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
public class Spaces {
public static boolean checkSpace(String s)
    {
        boolean isValid=true;
        for(int i=1;i<s.length()-1;i++)
        {
            if(s.charAt(i)==' ')
            {
                char c=s.charAt(i-1);
                char c1=s.charAt(i+1);
                if(c!=c1)
                    isValid= false;
                break;
            }
            
        }
        return isValid;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        boolean result=checkSpace(s);

    }
    
}
