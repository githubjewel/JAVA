/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Md Rokibul Islam
 */
public class file {
    
      void test() throws IOException
     {
         FileReader f3=new FileReader("b.txt");
         FileWriter f4=new FileWriter("c.txt");
         
         
         String s="";
         Scanner in=new Scanner(f3);
         while(in.hasNextLine())
         {
             s+=in.nextLine();
             s+="\n";
         }
         System.out.println(s);
         f4.write(s);
         f3.close();
         f4.close();
        
        // s=JOptionPane.showInputDialog("Get Input");
         
        
     }
    
}
