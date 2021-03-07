/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loop;

/**
 *
 * @author abli
 */
public class DisplayDigit {

    public static void main(String[] args) {
        int n = 153;
        int r;
        int sum = 0;
        int m = n;

        while (n > 0) {

            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;

        }
        if (sum == m) {
            System.out.println("It is armstrong");
        } else {
            System.out.println("not");
        }

    }

}
