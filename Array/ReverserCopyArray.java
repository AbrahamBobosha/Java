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
public class ReverserCopyArray {

    public static void main(String[] args) {

        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int B[] = new int[9];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        for (int i : A) {
            System.out.print("A");
            System.out.print(i + ",");
        }
        System.out.println("");
        System.out.print("Copy B");
         System.out.println("");
        for (int j : B) {
            
            System.out.print("B");
            System.out.print(j + ",");
        }
        System.out.println("");
        System.out.println("Reverse b");
        for (int i = B.length - 1; i >= 0; i--) 
            
        
            System.out.print(B[i]+",");

        
        System.out.println("");

    }

}
