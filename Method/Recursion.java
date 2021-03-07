/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

/**
 *
 * @author abli
 */
public class Recursion {
    
    public static void main(String[] args) {
        fun (5);
    }
    
    static void fun(int n)
    {
        if (n>0)
        {
            fun(n-1);
            System.out.println(n);             
        }
    }
}
