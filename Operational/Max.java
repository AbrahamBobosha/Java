/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operational;

/**
 *
 * @author abli
 */
public class Max {
    
    int max ( int x, int y)
    {
        if (x > y)
            return x;
        else 
            return y;
               
    }
    public static void main(String[] args) {
        int a = 5, b = 6, c;
        
        Max m = new Max();
        c = m.max(a, b);
        System.out.println("The Biggest number is ");
        System.out.println(c);
      
    }
    
}
