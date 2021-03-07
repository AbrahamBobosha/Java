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
public class Switch_day {

    public static void main(String[] args) {

        System.out.println("insert the number from 1 to 7");
        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");

                break;
            case 2:
                System.out.println("Tuesday");

                break;
            case 3:
                System.out.println("wendsday");

                break;
            case 4:
                System.out.println("Thursday");

                break;
            case 5:
                System.out.println("Friday");

                break;
            case 6:
                System.out.println("Saturday");

                break;
            case 7:
                System.out.println("Sunday");

                break;
            default:
                throw new AssertionError();
        }
    }

}
