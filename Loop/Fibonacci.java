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
public class Fibonacci {
    
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);  
          System.out.println("Fibonacci series");
          System.out.println("Enter number of terms");
          int f = scan.nextInt();
          
          int a = 0 , b = 1 , c;
          
          System.out.print(a +","+ b +",");
          for (int i = 0; i <f-2; i++) {
            c = a+b;
              System.out.print(c + ",");
              a=b;
              b=c;
              
        }
    }
    

    
    
    
    
}
