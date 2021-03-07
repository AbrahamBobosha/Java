/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loop;

/**
 *
 * @author abli
 */
public class Factorial {
    
    public static void main(String[] args) {
        // factorial
        int n = 5;
        int sum = 1;
        
        for (int i = 1; i <= n; i++) {
            
            sum = sum *i;
            System.out.println(sum);
        }
    }
    
}
