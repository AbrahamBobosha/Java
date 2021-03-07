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
public class FindElement {
    public static void main(String[] args) {
        
        int sum = 0;
        int array [] = {3,9,7,8,12,6,15,5,4,10};
        
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
            System.out.print(sum + ",");
        }
        
        
    }
    
}
