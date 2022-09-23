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
import java.util.ArrayList;

public class JavaApplication73 {
public static ArrayList<Integer> user_integers() {
  Scanner in = new Scanner(System.in);
  ArrayList<Integer> result = new ArrayList<Integer>();
  while(true)
  {
    System.out.printf("Enter a number, or q to quit: ");
    String input = in.next();
    if (input.equals("q"))
    {
      return result;
    }
    int number = Integer.parseInt(input);
    result.add(number);
  }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ArrayList<Integer> numbers = user_integers();

  System.out.printf("\n");
  for (int i = 0; i < numbers.size(); i++)
  {
    System.out.printf("position %d: = %d\n", i, numbers.get(i));
  }

    }
    
}
