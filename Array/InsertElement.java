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
public class InsertElement {

    public static void main(String[] args) {
        
        
        int A[] = new int [10];
       
        A[0] = 3;
        A[1] = 4;
        A[2] = 5;
        A[3] = 6;
        A[4] = 7;
        A[5] = 8;
   
        int n= 6;
        //insert x= 20 on index 4;
        for (int i = 0; i < n; i++) 
            System.out.print(A[i] + "," );
            System.out.println("");
        
        
        int x= 20;
        int index = 2;
        //shift the array and insert new
        for (int i = n; i >index; i--) 
            A[i] = A[i-1];
            A[index] = x;
        
        for (int i = 0; i < n; i++) 
            System.out.print(A[i] + "," );
            System.out.println("");
        
    }
    
    

}
