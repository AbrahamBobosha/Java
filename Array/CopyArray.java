/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author abli
 */
public class CopyArray {
    public static void main(String[] args) {
        
        int A[]={2,3,4,5,6,7,8,9,3,4};
        int B[]= new int [10];
        
        for (int i = 0; i < A.length; i++) 
            
            
            B[i] = A[i];
        
        for (int x : A) 
            System.out.print(x + ",");
        System.out.println("");
        
        for (int i : B) 
            System.out.print(i + ",");
          System.out.println("" );
        
    }
                
}
