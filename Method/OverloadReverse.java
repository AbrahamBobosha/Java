/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/**
 *
 * @author abli
 */
public class OverloadReverse {

    static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    static int[] reverse(int A[]) {
        int B[] = new int[A.length];

        for (int i = A.length - 1, j = 0; i >= 0; j++, i--) {

            B[j] = A[i];

        }
        return B;
    }

    public static void main(String[] args) {

        System.out.println("Insert a number"
                        + "");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        int A[] = {1, 2, 3, 4, 5};
        reverse(a);
        System.out.println(a);

    }
}
