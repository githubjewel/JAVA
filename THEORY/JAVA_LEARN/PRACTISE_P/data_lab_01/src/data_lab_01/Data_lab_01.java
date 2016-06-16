/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_lab_01;

import java.io.*;
import java.util.*;


/**
 *
 * @author Md Rokibul Islam
 */



public class Data_lab_01 {
    
    
    

    
    public static void main(String[] args) throws IOException {
        
        
        
         
        FileReader f1 = new FileReader("java_input.txt");
         FileWriter fw = new FileWriter("java_output.txt");
    
        
       int r;
   
         
       while ((r = f1.read()) != -1)
       {
           System.out.println(r);
            int a[]=new int[8];
               int i=7;
               while(r!=0)
               {
                  a[i]=r%2;
                  r/=2;i--;
               }
               for(int j=0; j<a.length; j++)
               {
                   System.out.print(a[j]);
                   if(a[j]==0)fw.write("-v");
                   else fw.write("+v");
               } System.out.println();
               
    }
    
    
      f1.close(); 
      fw.close();
      
      
     
      
     
    
        
    }
}
