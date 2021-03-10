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
public class ReadAllByte {
    public static void main(String[] args) throws Exception {
        
        byte B[] = {'1','2','3','4','5','6','7' };
        
        ByteArrayInputStream bytteArray = new ByteArrayInputStream(B);
        String str = new String (bytteArray.readAllBytes());
        System.out.println(str);
        bytteArray.close();
    
                           
                        
                   
        
    }
    
}
