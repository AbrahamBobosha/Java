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
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float base, height, area;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert the base and hight, separated with space");
        
        base = scan.nextFloat();
        height = scan.nextFloat();
        
        area = base * height/2;
        
        System.out.println("The Area is " + area);
        
        
        

        // TODO code application logic here
    }

}
