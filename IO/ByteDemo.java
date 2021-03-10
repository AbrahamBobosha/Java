/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.ByteArrayInputStream;

/**
 *
 * @author abli
 */
public class ByteDemo {
    public static void main(String[] args) throws Exception {
        
        byte B[] = {'1','2','3','4','5','6','7' };
        
        ByteArrayInputStream byteArray = new ByteArrayInputStream(B);
        
        int x;
        while ((x=byteArray.read())!=-1) {
            System.out.print((char)x);
                    }
                        
                   
        
    }
    
}
