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
public class GCD {

    public static void main(String[] args) {
     
        System.out.println(gcd(25, 10));

    }

    static int gcd(int m, int n) {

        while (m != n) {
            if (m > n) {
                m = m - n;
            } else 
                n = n - m;
        }
        return m;
    }

}
