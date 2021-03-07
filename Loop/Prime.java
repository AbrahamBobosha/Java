/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loop;

import java.util.Scanner;

/**
 *
 * @author abli
 */
public class Prime {

    public static void main(String[] args) {
        
         System.out.println("Enter a number");
         Scanner scan = new Scanner(System.in);
         
         int num = scan.nextInt();
        System.out.println(isPrime(num));
         

    }

    static boolean isPrime(int n) {
        
        for (int i = 2; i < n/2; i++) {
            
            if((n%i)==0)
               return false;
            
        }
        return true;

    }
}
