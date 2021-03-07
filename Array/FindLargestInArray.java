/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author abli
 */
public class FindLargestInArray {
    
    public static void main(String[] args) {
  
        int array [] = {3,9,7,8,12,6,15,5,4,10};
        
        int max1 = array[0];
        int max2 = array[0];
        
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] > max1) 
            {
             max2 = max1;
             max1 = array[i];
              
            }
            
            else if (array[i] > max2 )
          
                   max2 = array[i];
            
        }
        System.out.println("Second largest is " + max2);
        
    }
    
    
}
