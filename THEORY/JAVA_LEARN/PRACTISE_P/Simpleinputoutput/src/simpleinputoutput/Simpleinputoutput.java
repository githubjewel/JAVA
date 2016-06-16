/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleinputoutput;




import java.io.*;
import java.util.*;

public class Simpleinputoutput  {

  
    public static void main(String[] args) {
    
        Scanner in=new Scanner(System.in);
        String s="";
        s=in.next();
        int x;
        x=in.nextInt();
        
         
        System.out.println("The input string is "+s+x);
        
        String a,b,c;
        System.out.println("Enter the firts string : ");
        a=in.next();
        
        System.out.println("Enter the second string : ");
        b=in.next();
        
        c=a+" "+b;
                
        System.out.println("The final srting is : "+c);
    }
}


