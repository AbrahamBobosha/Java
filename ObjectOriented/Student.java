/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOriented;

/**
 *
 * @author abli
 */
public class Student {

    //Properties
    public String roll;
    public String name;
    public String course;
    public int m1, m2, m3;
    public int score;

    //Methods
    public double total() {
        return m1 + m2 + m3;
    }

    public double average() {
        return (m1 + m2 + m3) / 3;
    }

    public char grade() {
        if (score > 70) {
            return 'A';
        } else if (score < 70 && score > 60) {
            return 'B';
        } else {
            return 'C';
        }
    }

}

class MainStudent {

    public static void main(String[] args) {
        Student student = new Student();
        student.course = "001";
        student.name = "Mr";
        student.roll = "student";
        student.score =70;
        
        System.out.println("Student Name : " + student.name );
        System.out.println("Course : " + student.course );   
        System.out.println("Roll  : " + student.roll );   
        System.out.println("Score  : " + student.score );
         

    }
}
