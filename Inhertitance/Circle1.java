/*
  Generalization- Interfaces
    ex. Smart phone(iphone, samung, vivo)
        group of object --- student.
        vihicle
            car, bike, ship
        shape
            Triangle, Circle, Rectangle
  Specialization- Inheritance 
    ex. Iphone x (iphone xs), circle (cylinder)

        Rectangle - cuboid
uses keyword extends
 */
package Inhertitance;

/**
 *
 * @author abli
 */
class Circle {

    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

class Cylinder extends Circle {

    public double height;

    public double volume() {
        return area() * height;
    }

}

public class Circle1 {

    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.radius = 7;
        c.height = 10;

        System.out.println("Volume " + c.volume());
        System.out.println("Area " + c.area());

    }

}
