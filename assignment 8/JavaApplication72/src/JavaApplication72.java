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
public class JavaApplication72 {
public static int[] user_integers()
{
  Scanner in = new Scanner(System.in);
  System.out.printf("Enter N: ");
  int N = in.nextInt();
  
  int[] result = new int[N];
  for (int i = 0; i < N; i++)
  {
    System.out.printf("Enter value %d: ", i);
    result[i] = in.nextInt();
  }
  return result;
 }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numbers = user_integers();
  
  System.out.printf("\n");
  for (int i = 0; i < numbers.length; i++)
  {
    System.out.printf("numbers[%d] = %d\n",
                      i, numbers[i]);

    }
    
}
}