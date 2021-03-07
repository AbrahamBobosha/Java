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
public class Quadratic {

    public static void main(String[] args) {

        int a, b, c;
        double r1, r2;

        System.out.println("Insert three integers ");

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println("Root R1 " + r1 +  "\nRoot R2 "+ r2);

    }

}
