/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package input_using_swing;

/**
 *
 * @author Md Rokibul Islam
 */
import javax.swing.*;
import java.util.*;
public class Input_using_swing {

   
    public static void main(String[] args) {
        String family_name,s;
         //showInputDialog("First Name", "Enter Your First Name");

       //showInputDialog("Family", "Enter Your Family Name");
       family_name = JOptionPane.showInputDialog("Family name :","Family Name");//string input nebar jonno
       
       s=JOptionPane.showInputDialog("another name");
       
        s=s+family_name;
 
       // JOptionPane.showMessageDialog(null, s, "Name", JOptionPane.INFORMATION_MESSAGE);
        
       JOptionPane.showMessageDialog(null,s);//string output er jonno
        
        int ans=Integer.parseInt(JOptionPane.showInputDialog("get input"));//Integer input er jonno
        
            ans+=10;
                
          //   JOptionPane.showMessageDialog(null, ans, "Output", JOptionPane.INFORMATION_MESSAGE);
                  /*ERROR_MESSAGE     The can also be used instead of INFORMATION_MESSAGE
                  PLAIN_MESSAGE
               QUESTION_MESSAGE
                 WARNING_MESSAGE*/
            
              JOptionPane.showMessageDialog(null,ans);//Integer output er jonno
             
               //System.exit(0);
               
               System.out.println(ans);
               
               System.out.println(s);
         
             
               
     
      // x=Integer.getInteger(k);
        
       // x=Integer.parseInt(s);
        //System.out.println(x);
      //  x=Integer.getInteger(s);
        
       
               
               
        
            }  
    
}


/*int ans = Integer.parseInt( JOptionPane.showInputDialog(frame,
        "Text",
        JOptionPane.INFORMATION_MESSAGE,
   
        null,
        null,
        "[sample text to help input]"));*/
        // int ans = Integer.parseInt( JOptionPane.showInputDialog( "Text", JOptionPane.INFORMATION_MESSAGE, null, null, "[sample text to help input]").toString());
    
   