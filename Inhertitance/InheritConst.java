/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inhertitance;

class Parent
{
    public Parent()
    {
        System.out.println("Parent Constrcutor");
    }
            
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Grand Child Constructor");
    }
}
public class InheritConst 
{

    public static void main(String[] args) 
    {
        GrandChild c=new GrandChild();        
    }
    
}