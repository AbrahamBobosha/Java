
package Conditional;
public class email {
    public static void main(String[] args) {
        
        String str = "programmer@gmail.com";
        
        int i = str.indexOf("@");
        int k = str.indexOf(".");
        String user = str.substring(0, i);
        String domain = str.substring(i+1, k);
        
        //check if the string is email address.
       
        System.out.println("The User Name is " + user);
        System.out.println("The Domain Name is " + domain);
        
      
        String g = str.substring(i+1, k);

        if (g.equals(domain))
            System.out.println("it is gmail");
        else
            System.out.println("not gmail");
        
        
        
        
        
    }
    
}
