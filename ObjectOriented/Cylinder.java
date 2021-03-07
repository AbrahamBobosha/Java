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
public class Cylinder {
    //properties

    public double radius;
    public double height;

    //Method
    public double lidArea() {
        return 2 * Math.PI * radius * height;
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + Circumference() * height;

    }

    public double volume() {

        return lidArea() * height;

    }

    public double Circumference() {
        return 2 * Math.PI * radius;
    }

}

class mainCylinder {

    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();
        cylinder.height = 10;
        cylinder.radius = 4;

        double circumference = cylinder.Circumference();
        double lidArea = cylinder.lidArea();
        double volume = cylinder.volume();

        System.out.format("volume : %.2f \n", volume);
        System.out.format("lidArea : %.2f \n", lidArea );
        System.out.format("circumference : %.2f\n ", circumference);
        System.out.println("");

    }
}
