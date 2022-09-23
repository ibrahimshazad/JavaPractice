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
import java.io.File;
import java.io.PrintWriter;
public class WritingFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String fn = ("out.txt");
      PrintWriter out = null;
      try
      {
          out = newPrintWriter(fn);
      }
      catch(Exception e)
      {
          handle;
      }
    out.printf("nikal loveday");
    out.close();
    
    
    }
    
}
