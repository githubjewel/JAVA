
package filereadwrite;

import java.io.*;
import java.util.*;




///There are different process for file read and write in java



public class FileReadWrite  {

  
    public static void main(String[] args) throws IOException {
      
        //process_01:
        /*
       
       FileInputStream.read() returns -1 when there are no more characters to read. 
       * It returns an int and not a char so a cast is mandatory.

Please note that this won't work if your file is in UTF-8 format and contains multi-byte characters. 
* In that case you have to wrap the FileInputStream in an InputStreamReader and specify the appropriate charset. 
* I'm omitting it here for the sake of simplicity.*/

        /*
        FileInputStream fileInput = new FileInputStream("file.txt");
int r;
while ((r = fileInput.read()) != -1) {
   char c = (char) r;
   // do something with the character c
}
fileInput.close();

 
// another 
BufferedInputStream in = new BufferedInputStream(new FileInputStream("filename"));
while (currentChar = in.read() != -1) { 
    //do something 
}
in.close();
C:\JAVA PROGRAMMING-2013

*/  File F1 = new File("E:\\JAVA_LEARN\\PRACTISE_P\\FileReadWrite\\output_tdm1.txt");
       
        
        
       FileReader f1 = new FileReader("a.txt");
       
        FileWriter fw = new FileWriter("b.txt");//always string hisabe write korte hobe
        
       
       
       int r;//file theke read korar jonno single char kore
       while ((r = f1.read()) != -1)
       {
      char c = (char) r;
      fw.write(c);
      System.out.print(c);
   
    }
      System.out.println();
     // fw.write(" fsdfdsfdf");
    
      f1.close();
       fw.close();
      FileReader f2=new FileReader("b.txt");
       
       while ((r = f2.read()) != -1)
       {
      char c = (char) r;
    
      System.out.print(c);
   
    }
       f2.close();
       System.out.println();
    
       
       
       
       
       
       
       
       
       /*
       Scanner sc = new Scanner(f1);
      
        String st = "" ;
      
      //file a jevabe ache shaivabe array te nebar jonno
        while(sc.hasNextLine())
        {
           st += sc.nextLine();
            System.out.println(st);
          // if(sc.hasNextLine()) 
           st+="\n";
        }
         System.out.println(st);
       
      FileWriter fw ;
      fw = new FileWriter("b.txt");
      fw.write(st);
      fw.close();*/
        /*try {
            fw = new FileWriter("b.txt");
            fw.write("snv");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }*/
      
    }
}
