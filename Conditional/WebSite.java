/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditional;

import java.util.Scanner;

/**
 *
 * @author abli
 */
public class WebSite {
    public static void main(String[] args) {
        
        System.out.println("Insert the Website");
        Scanner scan = new Scanner(System.in);
        String url = scan.nextLine();
        
        String protocol = url.substring(0, url.indexOf(":"));
        String ext = url.substring(url.lastIndexOf(".")+1);
        
        if(protocol.equals("ftp"))
            System.out.println("it is file transfer protocol site");
        else if (protocol.equals("https"))
            System.out.println("it is a hyper transfer protocol site");
        else
            System.out.println("you make some error in you keyboard");
        
        
        if (ext.equals("com"))
            System.out.println("commercial");
        else 
            System.out.println("it is not commercial");
    }
    
}
