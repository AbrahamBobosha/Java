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
public class VariableArgument {
    
    public static void main(String[] args) {
       
        show();
        show(1,2,3,4);
        show(2,3,4,5);
        show (new int[]{1,2,3});
        
    }
    //using variable in the argument 
   static void show(int...A)
    {
       
        for (int x : A)  
            System.out.print(x + ",");
            System.out.println("");
            
        
       
    }
    
}
