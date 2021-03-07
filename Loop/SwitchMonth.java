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
public class SwitchMonth {

    public static void main(String[] args) {

        System.out.println("insert the number from 1 to 12");
        Scanner scan = new Scanner(System.in);
        //to read words separated with space
    
        
        int month = scan.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");

                break;
            case 2:
                System.out.println("Feb");

                break;
            case 3:
                System.out.println("Mar");

                break;
            case 4:
                System.out.println("Apr");

                break;
            case 5:
                System.out.println("Maj");

                break;
            case 6:
                System.out.println("June");

                break;
            case 7:
                System.out.println("July");

                break;
            case 8:
                System.out.println("August");

                break;
            case 9:
                System.out.println("September");

                break;
            case 10:
                System.out.println("October");

                break;
            case 11:
                System.out.println("November");

                break;
            case 12:
                System.out.println("December");

                break;
            default:
                throw new AssertionError();
        }
    }

}
