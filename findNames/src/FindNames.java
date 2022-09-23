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
public class FindNames {
    
    public static ArrayList<String> findNames( ArrayList<String> list , String wanted)
    {
      String  LowerWanted = wanted.toLowerCase();
      ArrayList<String> contains = new ArrayList<String> ();
              
            for (int i = 0;i<list.size();i++)
                
              {
             String Z = list.get(i).toLowerCase();
             if (Z.contains(LowerWanted))
             {
                 String k = list.get(i);
                 contains.add(k);
                 
             }
              
    }
            return contains;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <String> b = new ArrayList<String>();
          ArrayList <String> c = new ArrayList<String>();    
               b.add("bob smith");
               b.add("Elroy Jetson");
               b.add("Christina Johnson");
               b.add("Rachel Baker");
               b.add("chris Conly");
               
               String wanted = "cHriS";
               
               c = findNames(b,wanted);
               System.out.println(c);
               
                       
                       
                     
                
    }
    
}
