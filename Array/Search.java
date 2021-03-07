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
public class Search {
    
    public static void main(String[] args) {
  
        int array [] = {3,9,7,8,12,6,15,5,4,10};
        
        System.out.println("Enter a Key");
        Scanner scan = new Scanner (System.in);
        
        int key = scan.nextInt();
        
        for (int i = 0; i < array.length ; i++) 
        {
            
           
            if (key == array[i])
            {
                System.out.println("The index of key is " + i );
                System.exit(0);
            }
         
        }
        System.out.println("Not found");
    }
    
    
}
