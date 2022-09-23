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
public class ListMerge {
public static ArrayList<String> listMerge(ArrayList<String> X, ArrayList<String> Y)
    {
        ArrayList<String> result= new ArrayList();
        for(int i=0;i<X.size();i++)
        {
            result.add(X.get(i));
        }
            for(int j=0;j<Y.size();j++)
            {
                result.add(Y.get(j));
            }
 return result;       
    }
  public static void printStringList(String name, ArrayList<String> a)
  {
    System.out.printf("%7s: ", name);
    if (a == null)
    {
      System.out.printf("Null array!\n\n");
      return;
    }
    
    for (int i = 0; i < a.size(); i++)
    {
      System.out.printf("%12s", a.get(i));
    }
    System.out.printf("\n");
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
    a.add("Chicago");
    a.add("New York");
    a.add("Dallas");
    
    ArrayList<String> b = new ArrayList<String>();
    b.add("Berlin");
    b.add("London");
    b.add("Paris");
    b.add("Rome");
      
    ArrayList<String> result = listMerge(a, b);
    printStringList("a", a);
    printStringList("b", b);
    printStringList("result", result);

    }
    
}
