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
public class IncreaseSizeArray {

    public static void main(String[] args) {
        int A[] = {3, 9, 7, 8, 12};
        int B[] = new int[2 * A.length];

        for (int i = 0; i < A.length; i++) 
            B[i] = A[i];
            System.out.println(B.length);
           for (int i : B) {
               System.out.print(i+ ",");
               System.out.print("");
        }
        



        
    }

}
