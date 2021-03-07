/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditional;

/**
 *
 * @author abli
 */
public class RemoveCharacter {
    public static void main(String[] args) {
        
        //abc123
        String str = "a!b@c#1%2;3";
        String abc = str.replaceAll("\\W", "");
        System.out.println(abc);
        System.out.println(str.replaceAll("[^a-z0-9]", ""));

         
    }
    
}
