/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimshahzad
 */
public class transpose {
    
    public static int [][] transpose(int [][] array )
    {
          
            int length = array.length;
            int n = array[0].length;
            int [][] myTable = new int [length][n];
            
            for(int i = 0;i<array.length;i++)
            {
                for (int j = 0;j<array[0].length;j++)
                {
                    myTable[i][j]= array[j][i];
                
            }
            }
            return myTable;
    }
     public static void printTable(int[][] table){
      int r,c;
      for(r = 0; r<table.length; r++){
         for(c = 0; c<table[0].length; c++){
            System.out.print(table[r][c]+", ");
         }
         System.out.println();
      }
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int[][] array = {{2,3,4},{5,6,4}};
      System.out.println("-- Q2: ");
      System.out.println("Original matrix: ");
      printTable(array);
      int[][] transp = transpose(array); 
      System.out.println("Transposed matrix: ");
      printTable(transp);    }
    
}
