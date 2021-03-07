/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditional;

import java.util.Scanner;

/**
 *
 * @author abli
 */
public class typeofNumber {
    
    public static void main(String[] args) {
        
        System.out.println("pls write the string");
        Scanner scan = new Scanner (System.in);
        
        String text = scan.next();
       
        if (text.matches("[01]+"))
            System.out.println("Binary 2");
        else if (text.matches("[0-7]+"))
            System.out.println("Octal 8");
        else if (text.matches("[0-9A-F]+"))    
            System.out.println("Hexa 16");
        else if (text == "[0-9]+")
            System.out.println("Decimal 10");
                    
        
    }
                   
    
}
