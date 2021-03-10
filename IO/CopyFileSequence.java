/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.*;
 /*
 * @author abli
 */
public class CopyFileSequence {
    public static void main(String[] args) throws Exception {
        
        FileInputStream fus = new FileInputStream("UpperCase.txt");
        FileInputStream fls = new FileInputStream ("LowerCase.txt");
       
        FileOutputStream fos = new FileOutputStream("Destination.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fus, fls);
        
        int b;
        while ((b=sis.read())!=-1)
        {
            fos.write(b);
        }
        sis.close();
        fus.close();
        fls.close();
                  
                
            
    }
    
}