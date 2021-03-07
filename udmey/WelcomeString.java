/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udmey;

/**
 *
 * @author abli
 */
public class WelcomeString {
    
    static void welcome (String n)
    {
        System.out.println("Welcome " + n);
    }
    public static void main(String[] args) {
        String name = "Abraham";
        welcome(name);
    }
    
}

