/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Read data
    Read method 3 times
    available methods
    close method
write data 
    outputstream
    void write method 3 times
    void flash is use if we are using buffer.
    void close method.

 */
package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abli
 */
public class ReadingStringFromFile2 {

    public static void main(String[] args) throws Exception {

        try (FileInputStream fis = new FileInputStream("Hello.txt")) {
           
            int x;
            while ((x = fis.read()) != -1) {
                System.out.print((char) x);

            }

        }

    }

}
