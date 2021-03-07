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
public class FindOddorEven {

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("insert a number");
        n = scan.nextInt();
        
        /*
        if (n % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd ");
        }
        */
        
        if (n < 18)
            System.out.println("The person is young");
        else
            System.out.println("The persone is adult");
        }

}
