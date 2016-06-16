/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashmap2;

import java.util.*;

/**
 *
 * @author Md Rokibul Islam
 */
public class SinKey_Multi_Value {
    public static void main(String args[]) throws Exception
    {
        ///ArrayList index dia access kora jai
        List<String> a= new ArrayList<String>();
             a.clear();a.add("Apple");a.add("Aeroplane");
             a.add("Apple");//System.out.println(a.get(0));
             
        List<String> b= new ArrayList<String>();
             b.clear();b.add("bal");b.add("brother");
             b.add("Banana");//System.out.println(b.get(0));
             
        List<String> c= new ArrayList<String>();
             c.clear();c.add("cat");c.add("car");
             c.add("cow");//System.out.println(b.get(0));
             
             
             
            ///map define korle only string use kora jain
             ///map theke kichu ket korle type conversion kote hoi
          HashMap <String ,List<String>> hm=new HashMap<String, List<String>>();   
          hm.clear();hm.put("b",b); hm.put("c",c);
                    hm.put("a",a);  //System.out.println(hm);
                    
                //display the key and values
                    // get all the set of keys
                  Set<String> keys = hm.keySet();
                  System.out.println(keys);
                  for(String key:keys)
                  {
                       List<String> values = hm.get(key);
                       System.out.println("Key:= "+key+" "+"values = "+values);
                       System.out.println("First index value: "+values.get(0));
                       //System.out.println("Key = " + key);
                      // System.out.println("Values = " + hm.get(key) + "n");
                  }
          
          Scanner in=new Scanner(System.in);
         while(true)
          {
            
            if(hm.isEmpty()){System.out.println("All items finished");break;}
            System.out.print("Enter kye value: ");
            String s=in.next();
             if(hm.containsKey(s))     
            {
                System.out.println("Contents are: ");
                System.out.println(hm.get(s));
                hm.remove(s);

            }
             else{System.out.println("No item found in for this key");}
              
          }
                  
          
          
                     
    }
    
}
