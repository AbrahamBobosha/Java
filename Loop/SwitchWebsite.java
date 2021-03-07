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
public class SwitchWebsite {

    public static void main(String[] args) {

        String site = "Https://www.google.com";
       // String site1 = "Https://www.google.org";
       // String site2 = "Https://www.google.edu";
        
        String protocol = site.substring(0, site.indexOf(":"));
        String ext = site.substring(site.lastIndexOf(".") + 1);

        switch (ext) {
            case "com":
                System.out.println("Commercial");

                break;
            case "org":
                System.out.println("Organizational");

                break;
            case "edu":
                System.out.println("educational");

                break;
            default:
                throw new AssertionError();
        }
    }

}
