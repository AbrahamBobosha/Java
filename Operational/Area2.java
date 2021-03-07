/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operational;

import java.util.Scanner;

/**
 *
 * @author abli
 */
public class Area2 {
    
    public static void main(String[] args) {
        
        int a, b, c;
        float s; 
        double area;
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls insert three side of the triangle");
        
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        s = (a+b+c)/2f;
        
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is " + area);
        
        
                
        
       
        
        
        
    }
    
}
