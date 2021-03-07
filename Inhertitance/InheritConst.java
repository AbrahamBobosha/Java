/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inhertitance;

/**
 *
 * @author abli
 */
public class Inheritance {

    public static void main(String[] args) {

       // parent parent1 = new parent();
      //  child child1 = new child();
        grandChild grandChild1 = new grandChild();
    }

}
class parent {

    public parent() {
        System.out.println("This is parent class");
    }

}

class child extends parent {

    public child() {
        System.out.println("This is child class");
    }
}

class grandChild extends child {

    public grandChild() {
        System.out.println("This is grandChild class");
    }
}
