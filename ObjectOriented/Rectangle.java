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
public class Rectangle {

    public double length;
    public double width;

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public boolean isValid() {
        if (length > 0) {
            return true;
        } else {
            return false;
        }
    }

}

class MainRectangle {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.length = -5;
        rectangle.width = 10;

        double A = rectangle.area();
        double B = rectangle.perimeter();

 
        if (rectangle.isValid() == true) {
            System.out.print(A + ", ");
            System.out.print(B);
            System.out.println("");
        } else {
            System.out.println("Please use valid value for length");
        }

    }
}
