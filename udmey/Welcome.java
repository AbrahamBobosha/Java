/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udmey;

import java.util.Scanner;

/**
 *
 * @author abli
 */
public class Welcome {
    
    public static void main(String[] args) {
        
        String name ;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls insert your name -  ");
        
        name = scan.next();
        System.out.println("Welcome " + name);
        
        
    }
    
}
