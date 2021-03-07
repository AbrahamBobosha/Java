/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditional;

import java.util.Arrays;

/**
 *
 * @author abli
 */
public class MaxInt {
    
    
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,4,7,4,19};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
       
        
    }
    
    
    
    
}
