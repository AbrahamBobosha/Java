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
public class Reverse {
    
    public static void main(String[] args) {
        System.out.println("Insert a number"
                        + "");   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = n;
        int rev = 0;
        int r;
        
        while (n>0) 
        {
            r = n%10;
            rev = rev * 10 +r;
            n = n/10;
            
        }
            
        if (rev == m)
            System.out.println("It is a palindrome");
         else
            System.out.println("It is not a paldindrome");
        
    }
    
}
