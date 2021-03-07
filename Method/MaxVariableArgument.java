/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

/**
 *
 * @author abli
 */
public class MaxVariableArgument {

    public static void main(String[] args) {

        int a = max(1, 50, 3, 4);
        System.out.println(a);
    }

    static int sum(int... a) {

        int b = 0;

        for (int i = 0; i < a.length; i++) {
            b += a[i];
        }
        return b;

    }

    static double discount(double... p) {
        int b = 0;

        for (int i = 0; i < p.length; i++) {
            b += p[i];
        }
        if (b < 500)
            return b*(10/100);
        else if (b >  500 && b < 1000)  
            return b*(20/100);
        else
            return b* 0.30;
        
   
    }

    static int max(int... A) {

        if (A.length == 0) {
            return Integer.MIN_VALUE;
        }
        int m = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] > m) {
                m = A[i];
            }

        }
        return m;

    }

}
