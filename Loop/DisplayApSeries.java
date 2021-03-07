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
public class DisplayApSeries {
    public static void main(String[] args) {
        int a = 4;
        int d = 3;
        int n = 10;
        int Ap= a;
        int Gp;
        int fib;
        int sum = 0;
                        
        // Ap series
        
        
        for (int i = 0; i < n; i++) {
            Ap = Ap + d;
            System.out.print(Ap + ",");
        }
    }
}
