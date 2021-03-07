/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loop;

import java.util.Scanner;

/**
 *
 * @author abli
 */
public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Insert Year");
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("It is not ");
                }
            } else {
                System.out.println("It is a leap year");
            }
        } else {
            System.out.println("It is not");
        }
    }

}
