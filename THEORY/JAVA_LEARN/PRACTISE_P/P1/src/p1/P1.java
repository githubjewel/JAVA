
package p1;

import java.io.*;
import java.util.*;

public class P1 {

  
    public static void main(String[] args) throws IOException{

       
        FileReader f1=new FileReader("a.txt");
        FileWriter f2=new FileWriter("b.txt");
        String s="";
        Scanner in=new Scanner(f1);
        while(in.hasNextLine())
        {
            s+=in.nextLine();
            s+="\n";
        }
        f2.write(s);
        f1.close();
        f2.close();
        file ob=new file();
        ob.test();
    }
}
