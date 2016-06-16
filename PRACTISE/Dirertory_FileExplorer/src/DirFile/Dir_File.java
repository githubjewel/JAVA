package DirFile;
import java.util.Arrays;
import java.io.*;
import java.applet.*;
import java.awt.Desktop;
import java.awt.*;
import java.util.*;


/**
* Simple interactive console application.
* Uses the java.io.Console class of Java 6.
*/
public  class Dir_File {

  public static  void main(String args[]){
       try{
            
           
      /* to open file explorer using jar file
             String current = new java.io.File( "." ).getCanonicalPath();
             System.out.println("Current dir:"+current);
             File f=new File(current+"\\a.txt");
             if(!f.exists()){
             f.createNewFile();
             //FileWriter fw=new FileWriter(f);
             //fw.write("jewel");fw.close(); 
             
             }
             else{System.out.println();}
             Desktop d=Desktop.getDesktop();
             d.open(f);//d.edit(f);
             */
      
      
           //to open file explorer
        //Process p = new ProcessBuilder("explorer.exe", "/select,C:\\directory\\selectedFile").start();

        /* if (Desktop.isDesktopSupported()) {
               Desktop.getDesktop().open(new File("a.txt"));
            }*/


            File name=new File("a.txt");//current directory er jonno . use kora jabe for explorer
            BufferedWriter fr=new BufferedWriter(new
                    FileWriter(name));
            fr.write("jewel");fr.newLine();
             fr.write("1234");//fr.close();
            //File name=new File("a.txt");
            Desktop desktop = Desktop.getDesktop();
            desktop.open(name);//name should be exactly File type
            //file a aro ki chu like close korbo
            fr.newLine(); fr.write("jwel2");
            fr.close();
            
           
     
     
     
     
     
     
     // to create directories
     /*
           File dir=new File("Dir_1");
            //File dirs=new File("Direc1\\directory2\\directory3");//to create multiple
           if(!dir.exists())
           {
               dir.mkdirs();
               File f1=new File(".\\Dir_1\\b.doc");
               File f2=new File("b.txt");
               //f2.createNewFile();
                if(!f1.exists()){f1.createNewFile();}
                else {System.out.println("exits");}
           }else {System.out.println("exists");}*/
             
       }catch(Exception e) {}
    
      
  }
} 