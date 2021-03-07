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
public class day {
    public static void main(String[] args) {
        
        System.out.println("Insert 1-8");
        Scanner scan = new Scanner(System.in);
        
        int day = scan.nextInt();
        
        if (day == 1)
            System.out.println("Monday");
        else if(day == 2)
            System.out.println("Tuesday");
        else if (day ==3)
            System.out.println("Wendsday");
        else if (day ==4)
            System.out.println("Thursday");
        else if (day ==5)
            System.out.println("Friday");
        else if (day ==6)
            System.out.println("Saturday");
        else if (day==7)
            System.out.println("Sunday");
        
        
    }
}
