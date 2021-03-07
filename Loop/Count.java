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
public class Count {
    public static void main(String[] args) {
        int n = 1250;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
            System.out.println(count);

        }
    }
}
