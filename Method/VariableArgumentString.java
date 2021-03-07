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
public class VariableArgumentString {
    
    public static void main(String[] args) {
        showList(5,"John", "Smith", "Ajay","Abdi");
    }
    
    
    static void showList(int start,String...S)
    {
        for (int i = 0; i < S.length; i++) {
            System.out.println(start + ". " + S[i]) ;
            start++;
        }
    }
    
}
