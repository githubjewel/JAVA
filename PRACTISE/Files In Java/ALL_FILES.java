package File2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
//File-->FileReader/FileWriter-->BufferReader/BufferedWriter

public class file {
    
    public static void main(String args[])
    {
        try 
        {
            ///First get the file name of directory with name
            ///there are many functions realted to File
           File name=new File("a.txt");//get the file name only
           File name_w_path=new File("D:\\b.txt"); //get file name only with directory
              //File file = new File("C://test.txt");
          
           //to overwrite newfile.txt file that alreay exits  
           PrintWriter writer = new PrintWriter("newfile.txt", "UTF-8");
           writer.println("print one");
           writer.println("print two");
           writer.close();
           
           
           
           ///now create  the file
          FileWriter fw=null; 
          BufferedWriter bw=null; 
        
        if(!name.exists())  //check whether the file exits or not
        {
           // name.createNewFile();//create the file return boolean value
              //or
            //FileWriter fw1= new FileWriter("outputfile.txt");//we can also path instead of file name
                //FileWriter writer = new FileWriter("C:\\Users\\owner\\Desktop\\demo.txt");
            fw=new FileWriter(name);//creat the file 
                    //akane file close kora jaba na karon close korle pore file a leka jabe na
                    //FileWriter use korle BufferWeiter use na korleo kaj korbe
            
              //or
             bw = new BufferedWriter(fw);
              // BufferedWriter use korte FileWriter lagbe 
            //BufferedWriter bufw=new BufferedWriter(new FileWriter(name/name_w_path));
            //BufferedWriter bufw2=new BufferedWriter(FileWriter class varialbe);
            //BufferedWritr bw3=null;
            //bw3= new BufferedWriter(new FileWriter(directory to file);
             
             

                                               
         }else {System.out.println("FIle already exists");}
        
        
        ///now write on the file
        
       // String s=" "+"first line"+"\n"+"second line";
        char[] ca=new char[100];
        
        /* fw.write(ca); //write all contents of the ca array
           fw.write(s);//second time s er content change kore fun korle write hobe na 
           fw.append("\n");//this will not work because fw dia newline write kora jabe na
           fw.append('e');
           fw.close();  */
        
        
        bw.write("line one ");bw.newLine();
        bw.append('c');
        bw.write("line two");
        bw.close();
        
        
            ///now read from the file
       FileReader fr = new FileReader(name); 
           //FileReader fr1 = new FileReader("name.extension or path");
           //or
       BufferedReader br = new BufferedReader(fr);  
           // BufferedReader br1 = new BufferedReader(new FileReader(new File("D:\\a.txt")));//path or filename
           //BufferedReader br2 = new BufferedReader(new FileReader(name)));
       
       
          //use FileReader to read single character or all the contents of a file
     
          FileWriter fw2=new FileWriter("output.txt");
          BufferedWriter bw2=new BufferedWriter(fw2);
         //for all contents
          /*
        //char [] a = new char[500];//or
          char[] a=new char[(int)name.length()];
          fr.read(a); // reads all the content to the array
          fr2.write(a);fr2.close();
          for(char c : a)
               System.out.print(c); //prints the characters one by one
               //or
              // for(int i=0;i<a.length;i++){System.out.print(a[i]);}
          System.out.println();
          fr.close();  
          /*int r; 
          while((r=fr.read())!=-1){
              char c=(char)r;
              System.out.println(c);
          }  fr.close();*/
       
       
              String ss,ss2;
              while((ss = br.readLine()) != null) {
                  System.out.println(ss);
                  bw2.write(ss);bw2.newLine();
                       } br.close();//or fr.close();
                       bw2.close();
 
       // deletes file from the system
         name.delete();
         
    } catch (Exception e){}
}
}