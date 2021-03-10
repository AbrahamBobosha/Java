/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.*;
/**
 *
 * @author abli
 */
public class CopyingFile {

    public static void main(String[] args) throws Exception {

        try (FileInputStream fis = new FileInputStream("copy.txt")) {
            FileOutputStream fos=new FileOutputStream("copy1.txt");
            
            int b;
            while ((b=fis.read())!= 1)
            {
                if (b>=65 && b <=90)fos.write(b+32);
                else fos.write(b);
                
                
            }
            fos.close();
        }

    }

}
